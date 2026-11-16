# 📝 MY_WORK: Student Information, Development Log, Reflection & Answers

> This is the **only file** your instructor reads to grade Parts 3 and 4 (documentation and video). Everything you write here must be **in your own words**.

---

## 🛑 STOP: Read This Before You Do Anything Else

> ### 1️⃣ Read the whole `README.md` first
> The `README.md` in this repository contains the full instructions: class descriptions, feature specifications, question prompts and the video script. **If you skip it, you will lose marks.**
>
> ### 2️⃣ Understand the full code before answering any question
> Open `SchedulerSimulation.java` and read it **from top to bottom**. You must be able to explain what `Process`, `run()`, `runToCompletion()`, `addProcessToQueue()`, `Thread.start()`, `Thread.join()` and `Thread.sleep()` do **before** you write a single answer in Parts B and C. Run the program at least once and watch the output.
>
> ### 3️⃣ Commit many times, not once
> A single commit, or all commits made in the last hour, costs you **-0.5 mark**. See the [Commit Rules](#-commit-rules-mandatory) below.

**How to use this file:**
1. Fill in your **Student Information** (below) right now.
2. Follow the steps in the **Work Roadmap** in order.
3. Update the **Development Log** *every time* you work on the assignment, not at the end.
4. Do not delete any section header. Replace the `[...]` placeholders with your own text.

---

## 👤 Student Information

> ⚠️ **WARNING:** Fill this in first. Your name and ID must match the student ID you set in `SchedulerSimulation.java` (line 150) and the one you say in your video.

| Field | Your Answer |
|-------|-------------|
| **Full Name** | HURIYYAH MANSOUR (حورية منصور) |
| **Student ID** | 443051744 |
| **University Email** | 443051744@std.psau.edu.sa |
| **GitHub Username** | 443051744-lgtm |
| **Repository Link** | https://github.com/443051744-lgtm/OS-Assignment1-HURIYYAH-MANSOUR |
 
---

## 🎥 Video Link

**Video Link**: [Add your actual 2–3 minute demo video link after you record and upload it]
**Video Link**: [Watch Assignment 1 Demo Video](https://drive.google.com/file/d/1dlU-vXNn7QGKW5QoO687aBsuuseKUPUf/view?usp=drivesdk)

> ⚠️ **WARNING:** The video must be **publicly accessible** ("Anyone with the link can view") on **Google Drive**, **YouTube (Unlisted or Public)** or any other cloud file-sharing system. A private, restricted or broken link counts as a **missing video (-1 mark)**.
>
> 💡 **TIP:** Open the link in a **private/incognito window** before you submit. If it asks you to log in or request access, it is not public.
>
> 📌 **NOTE:** The link goes in **this file only** (`MY_WORK.md`), **not** in `README.md`. Name your video file `StudentID_Assignment1_Demo.mp4`. It must last **2 to 3 minutes**.

---

## 🗺️ Work Roadmap (follow in this order)

| Step | What to do | Where | Marks |
|:----:|------------|-------|:-----:|
| 0 | Read `README.md`, then read and run the full code | Your IDE | – |
| 1 | Fork, rename, keep the repo **PUBLIC**, set your student ID (line 150), **commit** | GitHub + code | Part 1 (1) |
| 2 | Feature 1: Process Priority, **commit** | Code | Part 2 (0.25) |
| 3 | Feature 2: Context Switch Counter, **commit** | Code | Part 2 (0.25) |
| 4 | Feature 3: Waiting Time Tracking, **commit** | Code | Part 2 (0.5) |
| 5 | Development Log (5+ entries, different dates) | This file, Part A | Part 3 (0.5) |
| 6 | Reflection (4 questions) | This file, Part B | Part 3 (0.5) |
| 7 | Technical Answers (4 questions) | This file, Part C | Part 3 (0.5) |
| 8 | Record the video, upload it, paste the link above | Video + this file | Part 4 (1.5) |
| 9 | Final check, then submit the repo link on Blackboard | Blackboard | – |

> 💡 **TIP:** Tick each step off as you go. Do not leave the log, the reflection or the video for the last day.

---

## 🔁 Commit Rules (MANDATORY)

> ### ⚠️ MANY COMMITS ARE REQUIRED. A single bulk commit is penalized (-0.5 mark).

**Minimum: 3 meaningful commits. Aim for 6 or more.**

| # | Commit | Example message |
|:-:|--------|-----------------|
| 1 | Student ID set | `Set my student ID: 441234567` |
| 2 | Feature 1: Priority | `Feature 1: Added priority field to Process class` |
| 3 | Feature 2: Context switches | `Feature 2: Implemented context switch counter` |
| 4 | Feature 3: Waiting time | `Feature 3: Added waiting time tracking and summary table` |
| 5 | Development log entries | `Docs: Added development log entries 1-3` |
| 6 | Reflection and answers | `Docs: Completed reflection and technical answers` |
| 7 | Video link | `Docs: Added demo video link` |

**Rules:**
- ✅ **One commit per feature.** Do not put all three features in one commit.
- ✅ **Commit after each work session**, and after each part of this file.
- ✅ **Spread your commits over different dates.** Not all in one day.
- ❌ **Do not make all commits in the last hour** before the deadline.
- ❌ **No vague messages** like `done`, `update` or `final version`.

> 💡 **TIP:** Your commit history is checked and you **show it in your video** (at least 3 commits visible). Your development log dates should match your commit dates.
>
> 💡 **TIP:** **Use VS Code** (see *Recommended Development Environment* in `README.md` for the full setup). Sign in to GitHub in VS Code, then commit from the Source Control panel (Ctrl+Shift+G) → stage → write a message → Commit → Sync/Push. You can edit and commit this file the same way. **Pushing** matters: commits that are not pushed to GitHub are invisible to the instructor.

---

# Part A: Development Log (0.5 mark)

> ⚠️ **WARNING:** Minimum **5 entries**, spread over **different dates**. Five entries written on the same day, or written all at once at the end, will lose marks and look like a copy. Entry dates should be **between the start of the assignment and the deadline (October 10, 2026)**.
>
> 💡 **TIP:** Write an entry at the **end of each work session**, while you still remember what happened. It takes 5 minutes.
>
> 💡 **TIP:** Be specific. "Worked on the code" is a weak entry. "Added a `static int contextSwitches` counter and incremented it before `currentThread.start()`" is a strong one.
>
> 📌 **NOTE:** Each entry needs: date and time, what you did, details, challenges, solution, and time spent. Real challenges are fine (and expected). Do not invent fake ones.

## Example Entry (do not copy it, write your own)

### Entry 1 - [September 22, 2026, 2:30 PM]
**What I did**: Forked the repository and set up my student ID

**Details**:
- Created GitHub account with university email
- Forked the starter repository and renamed it
- Changed student ID on line 150 to my actual ID (441234567)
- Compiled and ran the program successfully
- Committed and pushed: `Set my student ID: 441234567`

**Challenges**: Had to install JDK first because `javac` wasn't recognized

**Solution**: Downloaded JDK 17 and set the PATH variable

**Time spent**: 30 minutes

---

## Your Development Log

### Entry 1 - [September 20, 2026, 12:45–12:47 PM (GitHub commit timestamps)]
**What I did**: Set up the original Assignment 1 repository and added the Git ignore configuration.

**Details**: The repository history contains `first commit` and `add gitignore file` on this date. These are verified commits, not a guess about additional work outside GitHub.

**Challenges**: [Describe any setup difficulties you actually experienced, if any.]

**Solution**: The `.gitignore` file was committed to keep generated Java files out of version control.

**Time spent**: [Add your real time spent.]

---

### Entry 2 - [October 10, 2026, 10:32 PM (GitHub commit timestamp)]
**What I did**: Updated the student ID used as the random seed.

**Details**: Commit `Update student ID for random number generator` records this step. The source now contains `int studentID = 443051744;`.

**Challenges**: [Describe a genuine issue or write "None" if there wasn't one.]

**Solution**: The student's ID replaced the placeholder to make the simulation parameters reproducible.

**Time spent**: [Add your real time spent.]

---

### Entry 3 - [November 7, 2026, 8:06 PM (GitHub commit timestamp)]
**What I did**: Added the priority, context-switch counting, and waiting-time features.

**Details**: Commit `Implemented priority, context switch counting, and waiting time tracking` contains all three features. Note: the instructor requested separate feature commits, but this historical commit contains them together and cannot honestly be presented as three earlier commits.

**Challenges**: [Describe what was actually difficult during this work session.]

**Solution**: The current code stores a priority per process, counts CPU dispatches, and records waiting intervals with `System.currentTimeMillis()`.

**Time spent**: [Add your real time spent.]

---

### Entry 4 - [November 13, 2026, late evening - AI-assisted review]
**What I did**: Reviewed the repository against the instructor's README and tested the Java program with assistance.

**Details**: Verified the student ID, priority values, FIFO queue logic, dispatch counter and summary table. Compiled and ran the Java program successfully with student ID `443051744`: time quantum `5000 ms`, `10` processes, `20` CPU dispatches, and a waiting/turnaround summary for every process.

**Challenges**: The documentation was still largely blank, and the original three features had been committed together.

**Solution**: Prepared reviewable answer drafts and documented actual commit history without inventing earlier sessions. The student must verify the answers and complete their own missing session records.

**Time spent**: [Add your own review time; do not count assistant processing time as personal work.]

---

### Entry 5 - [November 13, 2026, 11:47 PM (GitHub commit timestamps)]
**What I did**: Restored the original progress-bar display and updated the assignment documentation with AI assistance.

**Details**:
- Updated `SchedulerSimulation.java` so both quantum progress and overall progress show visual bars again, while preserving the existing scheduling logic.
- Compiled the corrected code successfully.
- Filled in my real student information and the repository link in `MY_WORK.md`.
- Added draft responses to all four reflection questions and four technical questions, including real output showing `P1` returning to the ready queue once.
- GitHub records the separate code and documentation commits at 11:47 PM. This is the same calendar date as Entry 4, so it does not satisfy the different-dates requirement by itself.

**Challenges**: The edited code no longer displayed the original starter's progress bars, and the documentation template still had unanswered questions.

**Solution**: Reintroduced `createProgressBar()` for the execution output and prepared specific answer drafts that must be checked and rewritten in the student's own words.

**Time spent**: Not separately recorded; student should provide their actual review and writing time.

---

### Entry 6 - [Optional - Date and Time]
**What I did**:

**Details**:

**Challenges**:

**Solution**:

**Time spent**:

---

## Development Log Summary

> 💡 **TIP:** Fill this in **last**, after all entries are written.

**Total time spent on assignment**: [Calculate from your own session records.]

**Most challenging part**: [Draft: Understanding the difference between time spent running and time spent waiting in the ready queue.]

**Most interesting learning**: [Draft: A process with a lower priority value still runs in FIFO order, because priority is only displayed in this assignment.]

**What I would do differently next time**: [Draft: Commit each feature separately immediately after testing it and maintain the development log across the actual work dates.]

---

# Part B: Reflection (0.5 mark)

> **Review note:** The answers below are AI-assisted study drafts based on the actual code and observed program output. Check each point, revise it into your own words, and be ready to explain it before submission.

> 🛑 **STOP:** Do **not** start this part until you have read the `README.md`, read the **entire** `SchedulerSimulation.java`, run it, and finished the three features.
>
> ⚠️ **WARNING:** Each answer must be **5 to 7 sentences**, in **your own words**. Copied or AI-generated answers without understanding get **0 marks for the whole assignment**. You may be asked to explain them in person.
>
> 💡 **TIP:** Mention concrete things you actually did: a method you wrote, an error you hit, a line of output you saw. Generic answers score low.
>
> 💡 **TIP:** Draft your answer in a few bullet points first, then turn them into sentences.

## Question 1: What did you learn about multithreading?

> 💡 **TIP:** Talk about thread creation (`Runnable`, `Thread.start()`), waiting with `Thread.join()`, simulating work with `Thread.sleep()`, and what surprised you.

**Your Answer:** *(5-7 sentences)*

The program helped me see that a Java `Thread` can execute one time slice of a simulated process. The `Process` class implements `Runnable`, and `new Thread(process)` creates a thread that can run its code. Calling `Thread.start()` begins that work, but the scheduler calls `Thread.join()` so it does not move on before the current slice finishes. Inside `run()`, `Thread.sleep()` imitates the CPU time taken by a process. I also learned that a thread that has already finished cannot be started a second time, so the scheduler creates a fresh thread when it re-queues an unfinished process. The round-robin ready queue then gives other processes a turn instead of letting one process use the CPU indefinitely.

## Question 2: What was the most challenging part of this assignment?

> 💡 **TIP:** Pick **one** specific challenge (understanding the code, one of the features, Git, the video) and say *why* it was hard.

**Your Answer:** *(5-7 sentences)*

The most challenging concept was measuring a process's waiting time correctly. A process can be placed in the queue more than once, so measuring only from its creation time would not show the separate waiting intervals. The code saves `lastQueuedTime` whenever `addProcessToQueue()` enqueues a process. When the scheduler selects it again, `startRunning()` adds the elapsed time to `waitingTime`. I had to distinguish this waiting time from the time the process actually spends running its CPU bursts. I also needed to remember that the final turnaround value in this assignment is defined as waiting time plus burst time.

## Question 3: How did you overcome the challenges you faced?

> 💡 **TIP:** Describe your method: reading documentation, adding `System.out.println` to debug, re-reading the README, testing after each small change, asking for help.

**Your Answer:** *(5-7 sentences)*

I checked the assignment README to separate the three requested features from the original scheduling behavior. Then I followed the scheduler loop and looked at the point where a process is removed from the FIFO queue. The code shows the same process returning to the ready queue with a smaller remaining time when it does not finish in one quantum. Compiling the program confirmed that the Java syntax was valid, while the actual output helped check the priority values, queue order and summary numbers. For example, with my student ID, `P1` has a burst time of 8081 ms and returns to the queue after the first 5000 ms quantum. I would test and commit each feature independently in a future project so mistakes are easier to find and explain.

## Question 4: How can you apply multithreading concepts in real-world applications?

> 💡 **TIP:** Use real applications you know (web browser, game, mobile app, music player) and connect each one to what you built here.

**Your Answer:** *(5-7 sentences)*

Multithreading is useful when an application has several tasks that must make progress without waiting for one long task to end. A web browser might use different threads for user interaction, networking and background work. A game can keep processing input while other threads handle loading or background calculations. In an operating system, scheduling allows many runnable programs or threads to share processor time. The round-robin idea from this assignment illustrates fairness because each ready task receives a time quantum before another task gets a turn. It also showed me why an application's simulated `Process` object is not the same thing as an independent operating-system process.

### Optional: What would you like to learn more about?

[Any topics related to threading or operating systems that you're curious about?]

### Optional: How confident do you feel about multithreading concepts now?

[Beginner / Intermediate / Confident. What do you understand well? What needs more practice?]

### Optional: Feedback on the assignment

[Any comments? Was it helpful? Too easy or hard? Suggestions?]

---

# Part C: Technical Answers (0.5 mark)

> **Review note:** These are explanatory drafts, including one real output example. Verify the claims against your own IDE run and rewrite them in your own words.

> 🛑 **STOP:** You cannot answer these questions without understanding the code. Re-read `SchedulerSimulation.java` and **run it** first. Your answers must reference **your own code and your own output** (your student ID makes your output unique).
>
> ⚠️ **WARNING:** Each answer must be **3 to 5 sentences**, with specific examples from your code or output. Use correct terms: thread, process, time quantum, ready queue, context switch, burst time.
>
> 💡 **TIP:** Keep your program output in a text file or screenshot so you can copy real snippets for Question 2.

## Question 1: Thread vs Process

**Question**: Explain the difference between a **thread** and a **process**. Why did we use threads in this assignment instead of creating separate processes? Mention at least **TWO** specific differences (e.g., memory sharing, creation overhead, communication speed), and reference relevant parts of `SchedulerSimulation.java`.

> 💡 **TIP:** Note that the class named `Process` in our code is a *simulated* process, and it is run by a real Java *thread*. Explain that distinction and point to the `new Thread(process)` line in `addProcessToQueue()`.

**Your Answer:** *(3-5 sentences)*

A process is a running program with its own address space, while a thread is one path of execution inside a process. Threads within the same process can share memory more directly, and creating or switching threads usually requires less overhead than starting separate processes. In this simulation, the class called `Process` is only a model of a scheduled task, not an operating-system process. The method `addProcessToQueue()` creates a real Java thread with `new Thread(process)`, letting the program simulate CPU scheduling without launching separate operating-system programs.

## Question 2: Ready Queue Behavior

**Question**: In Round-Robin scheduling, what happens when a process doesn't finish within its time quantum? Explain using an example from **your** program output, including **how many times that process was re-queued** before it finished, and explain why re-queueing matters for fairness.

> ⚠️ **WARNING:** The output snippet must come from **your own run** (with your student ID), not from a classmate or from this README.
>
> 💡 **TIP:** Pick a process with a large burst time (e.g., more than 2 × time quantum) and count how many "added to ready queue" lines it has after the first one. Search your console for its name (e.g., `P3`).

**Your Answer:** *(3-5 sentences)*

When a process still has remaining burst time after one quantum, the scheduler calls `addProcessToQueue()` and places it at the back of the FIFO ready queue. In my run, the time quantum was 5000 ms and `P1` started with a burst time of 8081 ms. After the first 5000 ms, `P1` had 3081 ms left, so it was **re-queued once** before its next dispatch finished the remaining work. This is important for fairness because the other ready processes get their turns before `P1` runs again.

Example from my output:
```
Student ID: 443051744
Time quantum: 5000 ms
P1 (Priority: 4) enters the ready queue | Burst: 8081 ms | Remaining: 8081 ms
CPU dispatch #1: P1
Running P1 for 5000 ms
Remaining time: 3081 ms
P1 (Priority: 4) enters the ready queue | Burst: 8081 ms | Remaining: 3081 ms
```

**Explanation of example:**
The second `P1 enters the ready queue` line is the one re-queue after its first CPU slice. The remaining time decreases from 8081 ms to 3081 ms; `P1` waits for the other queued processes before getting its next turn.

## Question 3: Thread Lifecycle

**Question**: A thread goes through these states: **New**, **Runnable**, **Running**, **Waiting**, **Terminated**. Walk through these states for one process (e.g., P1) from your simulation. For each state, explain **when** P1 enters it and **which line or method call** triggers the transition (`Thread.start()`, `Thread.join()`, `Thread.sleep()`, etc.).

> 💡 **TIP:** Follow P1 through the code: created in `addProcessToQueue()`, started in the scheduler loop, sleeping inside `run()`, and the main thread waiting on `join()`. Remember that **the main thread waits** on `join()`, while **P1's thread sleeps** in `Thread.sleep()`. Be clear about which thread is in which state.

**Your Answer:** *(3-5 sentences overall; one short explanation per state)*

1. **New**: `new Thread(process)` creates the first thread for `P1` in `addProcessToQueue()`, but it has not started yet.

2. **Runnable**: The scheduler calls `currentThread.start()`, making `P1` eligible to run on the JVM's threads.

3. **Running**: When the JVM schedules that thread on a CPU, it executes `Process.run()` for up to one time quantum (Java officially counts this as part of `RUNNABLE`).

4. **Waiting**: `P1` enters `TIMED_WAITING` when its `run()` calls `Thread.sleep()`; separately, the **main scheduler thread**, not `P1`, enters a waiting state when it calls `currentThread.join()`.

5. **Terminated**: That Java thread terminates when its `run()` method returns. If the simulated process still has remaining time, the program creates a **new** Java thread for its next turn.

## Question 4: Real-World Applications

**Question**: Give **TWO** real-world examples where Round-Robin scheduling with threads would be useful. **At least one** must be an operating-system-level scenario (e.g., how an OS scheduler shares CPU time among running programs). The second can be any application you choose. For each, explain what the system is and **why Round-Robin fits** (fairness, responsiveness, predictability).

> 💡 **TIP:** Relate each example back to your simulation: what plays the role of the "process", the "time quantum" and the "context switch" in that scenario?

**Your Answer:** *(3-5 sentences per example)*

### Example 1 (operating-system level): Sharing CPU time among runnable threads

**Description**:
An operating system may have several runnable threads from a browser, music player and other programs competing for CPU time. Each ready thread is comparable to one simulated process entry in this assignment. A short time quantum lets the scheduler return to other ready work frequently.

**Why Round-Robin works well here**:
Round-Robin is useful here because it rotates CPU time fairly instead of allowing one CPU-bound thread to monopolize the processor. The queue order corresponds to the assignment's FIFO ready queue, and each new dispatch resembles the program's context-switch counter. Real operating systems often use more advanced scheduling policies, but the model illustrates the basic principle.

### Example 2: A simple task-processing service

**Description**:
A server may have several background tasks that each need CPU time, such as generating reports or processing independent jobs. A basic cooperative scheduler could give each ready task a limited slice and then put unfinished work back in the queue. Each job would play the role of a simulated `Process` object.

**Why Round-Robin works well here**:
Round-Robin would make progress more predictable for multiple jobs because no single long task takes every turn. The quantum limits how long a task runs before the next one gets attention, and a new dispatch is analogous to a context switch. Real server executors may use other strategies, but the example shows why fair rotation can help responsiveness.

## Summary

**Key concepts I understood through these questions:**
1. `Runnable`, `Thread.start()` and `Thread.join()` have different roles in the simulation.
2. FIFO re-queueing helps share CPU time fairly.
3. Waiting time increases while a process is in the ready queue, not while it executes.

**Concepts I need to study more:**
1. The differences between a simulated ready queue and an operating system's real scheduling queues.
2. Java thread states and why `Thread.sleep()` is `TIMED_WAITING`, not the same as the main thread's `join()` waiting.

---

# ✅ Final Checklist (complete before submitting)

> ⚠️ **WARNING:** Go through every line. Late submission costs **-1 mark per day**, and the deadline is **October 10, 2026**.

**Repository**
- [ ] Repository is **PUBLIC** (Settings → Danger Zone → Visibility)
- [ ] Repository is renamed to `OS-Assignment1-YourFirstName-YourLastName`
- [ ] GitHub account uses the university email (`@std.psau.edu.sa`)

**Code**
- [ ] Student ID is set in `SchedulerSimulation.java` (line 150)
- [ ] Code compiles and runs with no errors
- [ ] Feature 1 (priority), Feature 2 (context switches) and Feature 3 (waiting time table) all work
- [ ] Each feature has clear comments

**Commits**
- [ ] **At least 3 meaningful commits, ideally 6 or more**
- [ ] **One commit per feature**
- [ ] Commits are spread over **different dates** (not all in the last hour)
- [ ] Everything is **pushed** to GitHub

**This file (`MY_WORK.md`)**
- [ ] Full name and student ID filled in at the top
- [ ] Development log has **5+ entries** on different dates
- [ ] Reflection: 4 questions, 5-7 sentences each
- [ ] Technical answers: 4 questions, 3-5 sentences each, with examples from **your** output
- [ ] No `[...]` placeholders left
- [ ] No section headers deleted

**Video**
- [ ] 2-3 minutes long, named `StudentID_Assignment1_Demo.mp4`
- [ ] Shows your name, ID, repository, 3 features, IDE execution, one threading concept, and commit history
- [ ] Link is **public** (tested in an incognito window) and pasted in the **Video Link** section above

**Blackboard**
- [ ] Submit **only** the link to your public GitHub repository

> 🎯 **Good luck!** Start early, commit regularly, and make sure you can explain every line you submit.
