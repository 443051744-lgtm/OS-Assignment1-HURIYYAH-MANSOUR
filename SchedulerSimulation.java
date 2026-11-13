import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;

// Console colors used by the original scheduler simulation.
class Colors {
    static final String RESET = "\u001B[0m";
    static final String CYAN = "\u001B[36m";
    static final String GREEN = "\u001B[32m";
    static final String YELLOW = "\u001B[33m";
    static final String MAGENTA = "\u001B[35m";
}

// Each Process is a Runnable. One new Java Thread is used for each time slice.
class Process implements Runnable {
    private final String name;
    private final int burstTime;
    private final int timeQuantum;
    private int remainingTime;

    // Feature 1: Priority ranges from 1 to 10; it does not change FIFO order.
    private final int priority;

    // Feature 3: Record creation time and accumulate time in the ready queue.
    private final long creationTime;
    private long lastQueuedTime;
    private long waitingTime;

    public Process(String name, int burstTime, int timeQuantum, int priority) {
        this.name = name;
        this.burstTime = burstTime;
        this.timeQuantum = timeQuantum;
        this.priority = priority;
        this.remainingTime = burstTime;
        this.creationTime = System.currentTimeMillis();
        this.lastQueuedTime = creationTime;
        this.waitingTime = 0;
    }

    public void enterReadyQueue() {
        lastQueuedTime = System.currentTimeMillis();
    }

    public void startRunning() {
        waitingTime += System.currentTimeMillis() - lastQueuedTime;
    }

    @Override
    public void run() {
        int runTime = Math.min(timeQuantum, remainingTime);
        System.out.println(Colors.GREEN + "Running " + name + " for " + runTime + " ms" + Colors.RESET);

        // Show five progress updates while simulating CPU execution.
        int completed = 0;
        try {
            for (int i = 1; i <= 5; i++) {
                int target = runTime * i / 5;
                Thread.sleep(target - completed);
                completed = target;
                // Keep the original starter's visual progress-bar display.
                System.out.println("  Quantum progress: " + createProgressBar(i * 20, 15));
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Execution interrupted: " + name);
            return;
        }

        remainingTime -= runTime;
        int progress = (burstTime - remainingTime) * 100 / burstTime;
        System.out.println("  Overall progress: " + createProgressBar(progress, 20));
        System.out.println("  Remaining time: " + remainingTime + " ms");
    }

    private String createProgressBar(int progress, int width) {
        int filled = progress * width / 100;
        StringBuilder bar = new StringBuilder("[");
        for (int i = 0; i < width; i++) {
            bar.append(i < filled ? "█" : "░");
        }
        return bar.append("] ").append(progress).append("%").toString();
    }

    // The last process gets the CPU until it finishes, without re-queuing.
    public void runToCompletion() {
        System.out.println(Colors.YELLOW + name + " is the last process: running to completion." + Colors.RESET);
        try {
            Thread.sleep(remainingTime);
            remainingTime = 0;
            System.out.println(Colors.GREEN + name + " completed." + Colors.RESET);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Execution interrupted: " + name);
        }
    }

    public String getName() { return name; }
    public int getBurstTime() { return burstTime; }
    public int getRemainingTime() { return remainingTime; }
    public int getPriority() { return priority; }
    public long getCreationTime() { return creationTime; }
    public long getWaitingTime() { return waitingTime; }
    public long getTurnaroundTime() { return waitingTime + burstTime; }
    public boolean isFinished() { return remainingTime <= 0; }
}

public class SchedulerSimulation {
    // Feature 2: Count each CPU dispatch, including the first one.
    private static int contextSwitches = 0;

    public static void main(String[] args) {
        int studentID = 443051744;
        Random random = new Random(studentID);

        // Time quantum: 2000, 3000, 4000 or 5000 milliseconds.
        int timeQuantum = 2000 + random.nextInt(4) * 1000;
        // Number of processes: 10 to 20.
        int numProcesses = 10 + random.nextInt(11);

        Queue<Thread> processQueue = new LinkedList<>();
        Map<Thread, Process> processMap = new HashMap<>();
        List<Process> allProcesses = new ArrayList<>();

        System.out.println(Colors.CYAN + "======================================");
        System.out.println("       ROUND-ROBIN CPU SCHEDULER       ");
        System.out.println("======================================" + Colors.RESET);
        System.out.println("Student ID: " + studentID);
        System.out.println("Time quantum: " + timeQuantum + " ms");
        System.out.println("Number of processes: " + numProcesses);
        System.out.println();

        for (int i = 1; i <= numProcesses; i++) {
            // Burst time: from half a quantum up to three quanta.
            int minBurst = timeQuantum / 2;
            int maxBurst = timeQuantum * 3;
            int burstTime = minBurst + random.nextInt(maxBurst - minBurst + 1);
            int priority = 1 + random.nextInt(10);  // Feature 1

            Process process = new Process("P" + i, burstTime, timeQuantum, priority);
            allProcesses.add(process);
            addProcessToQueue(process, processQueue, processMap);
        }

        System.out.println(Colors.GREEN + "\n=== SCHEDULER STARTING ===" + Colors.RESET);

        // FIFO Round-Robin: unfinished processes return to the back of the queue.
        while (!processQueue.isEmpty()) {
            Thread currentThread = processQueue.poll();
            Process currentProcess = processMap.remove(currentThread);

            System.out.print(Colors.MAGENTA + "Ready Queue: [" + Colors.RESET);
            boolean first = true;
            for (Thread thread : processQueue) {
                if (!first) System.out.print(" -> ");
                System.out.print(processMap.get(thread).getName());
                first = false;
            }
            System.out.println("]");

            // Feature 3: The process stops waiting when it gets the CPU.
            currentProcess.startRunning();

            // Feature 2: Count each new CPU dispatch.
            contextSwitches++;
            System.out.println("CPU dispatch #" + contextSwitches + ": " + currentProcess.getName());

            currentThread.start();
            try {
                currentThread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Scheduler interrupted.");
                return;
            }

            if (!currentProcess.isFinished()) {
                if (!processQueue.isEmpty()) {
                    addProcessToQueue(currentProcess, processQueue, processMap);
                } else {
                    // Same process continues; no additional context switch.
                    currentProcess.runToCompletion();
                }
            }
        }

        System.out.println(Colors.GREEN + "\n=== ALL PROCESSES COMPLETED ===" + Colors.RESET);
        System.out.println("Total context switches: " + contextSwitches);

        // Feature 3: Waiting time and turnaround summary.
        System.out.println("\nPROCESS SUMMARY (milliseconds)");
        System.out.println("-------------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-12s %-14s %-14s%n",
                "Process", "Priority", "Burst", "Waiting", "Turnaround");
        System.out.println("-------------------------------------------------------------------");

        long totalWaiting = 0;
        long totalTurnaround = 0;
        for (Process process : allProcesses) {
            System.out.printf("%-10s %-10d %-12d %-14d %-14d%n",
                    process.getName(), process.getPriority(), process.getBurstTime(),
                    process.getWaitingTime(), process.getTurnaroundTime());
            totalWaiting += process.getWaitingTime();
            totalTurnaround += process.getTurnaroundTime();
        }
        System.out.println("-------------------------------------------------------------------");
        System.out.printf("Average waiting time: %.2f ms%n", (double) totalWaiting / numProcesses);
        System.out.printf("Average turnaround time: %.2f ms%n", (double) totalTurnaround / numProcesses);
    } 

    // Create a fresh Thread for each queue entry: a Java Thread cannot restart.
    public static void addProcessToQueue(Process process, Queue<Thread> processQueue,
                                         Map<Thread, Process> processMap) {
        Thread thread = new Thread(process);
        process.enterReadyQueue();
        processQueue.add(thread);
        processMap.put(thread, process);
        System.out.println(Colors.CYAN + process.getName() + " (Priority: "
                + process.getPriority() + ") enters the ready queue"
                + " | Burst: " + process.getBurstTime() + " ms"
                + " | Remaining: " + process.getRemainingTime() + " ms" + Colors.RESET);
    }
}
