# Practice Sheet Concepts Ordered

Source: `Practice Sheet OS.pdf`

This document groups the practice-sheet questions by concept in the order the topics build on each other. Each question line keeps the original question idea and the answer key from the sheet.

## 1. Introduction to Operating Systems

An Operating System is the main system software that works between user programs and hardware. It provides services like program execution, I/O handling, file handling, CPU scheduling, memory allocation, protection, error detection, and user interfaces.

### Questions

- Q1. A student runs a Java program that prints output on the screen. Which OS services may be involved?  
  Answer: A, B, D
- Q2. Which statements correctly describe an Operating System?  
  Answer: A, B, D
- Q3. A program wants to create a new file and write data into it. Why does it need OS support?  
  Answer: A, B, C
- Q4. Which are examples of Operating System responsibilities?  
  Answer: A, B, C
- Q5. Which statements about system calls are TRUE?  
  Answer: A, B, D
- Q6. A user opens a browser, music player, and code editor together. What helps the system manage these applications?  
  Answer: A, B, C
- Q7. A student saves a text file from a code editor. Which OS services are most directly involved?  
  Answer: A, B, C
- Q8. Which of the following are examples of I/O devices managed by the OS?  
  Answer: A, B, C
- Q9. Which statements about file management are TRUE?  
  Answer: A, B, C
- Q10. Which OS service is most directly involved when a program crashes due to illegal memory access?  
  Answer: A, B, C
- Q61. A user clicks on an application icon and the application starts loading. Which OS activities may happen?  
  Answer: A, B, C
- Q62. Which statements about Resource Allocation are TRUE?  
  Answer: A, B, C
- Q63. Which statements about Protection in an OS are TRUE?  
  Answer: A, B, D
- Q64. Which statements about the Command Line Interface are TRUE?  
  Answer: A, B, D
- Q65. Which statements about Graphical User Interface are TRUE?  
  Answer: A, B, D

## 2. Process Basics

A process is a program in execution. It has its own state and execution context. The OS tracks each process using information such as process state, program counter, CPU registers, memory details, and scheduling information. A process address space commonly contains code, stack, and heap sections.

### Questions

- Q11. Which statements about a Process are TRUE?  
  Answer: A, B, C
- Q12. Which items may be part of a process address space?  
  Answer: A, B, C
- Q13. Which statements about PCB are TRUE?  
  Answer: A, B, C

## 3. Process States and Lifecycle

Common process states are New, Ready, Running, Waiting, and Terminated. A process moves between these states as it is admitted into the ready queue, gets CPU time, waits for I/O, or completes execution.

### Questions

- Q14. A process is waiting for CPU time but is not currently executing. Which state is most suitable?  
  Answer: A
- Q15. A process is currently using the CPU. Which state is most suitable?  
  Answer: A
- Q16. Which transitions may happen in a process lifecycle?  
  Answer: A, B, C
- Q66. A process is created but has not yet been admitted to the ready queue. Which state best describes it?  
  Answer: A
- Q67. A process has completed execution and released its resources. Which state best describes it?  
  Answer: A
- Q68. Which statements about Process State are TRUE?  
  Answer: A, B, C

## 4. Context Switching, Dispatching, and Schedulers

The scheduler decides which ready process should get the CPU. The dispatcher gives CPU control to that selected process and performs the actual switch. A context switch saves the current process state and restores another process state, which creates overhead.

Schedulers:

- Long-term scheduler: admits jobs into the system and controls degree of multiprogramming.
- Short-term scheduler: selects the next process from the ready queue.
- Medium-term scheduler: may swap processes out of memory to reduce multiprogramming temporarily.

Processes may alternate between CPU bursts and I/O bursts during execution.

### Questions

- Q17. Which information is important during a context switch?  
  Answer: A, B, C
- Q18. Why does context switching create overhead?  
  Answer: A, B, C
- Q19. Which statements about a scheduler are TRUE?  
  Answer: A, B, C
- Q20. Which statements correctly describe context switching on a single-core CPU?  
  Answer: A, B, C
- Q51. Which statements about Dispatcher are TRUE?  
  Answer: A, B, C
- Q69. Which statements about Long-Term Scheduler are TRUE?  
  Answer: A, B, D
- Q70. Which statements about Short-Term Scheduler are TRUE?  
  Answer: A, B, C
- Q71. Which statements about Medium-Term Scheduler are TRUE?  
  Answer: A, B, C
- Q72. Which statements about CPU Burst are TRUE?  
  Answer: A, B, D
- Q73. Which statements about I/O Burst are TRUE?  
  Answer: A, B, D

## 5. CPU Scheduling Algorithms

CPU scheduling decides which ready process runs next. Some algorithms are non-preemptive, meaning the running process keeps the CPU until it finishes or waits. Others are preemptive, meaning the running process may be interrupted.

Main algorithms in the sheet:

- FCFS: first process to arrive runs first.
- SJF: shortest burst time gets preference.
- SRTF: preemptive version of SJF using remaining time.
- Priority Scheduling: process with higher priority is selected.
- Round Robin: each process gets a fixed time quantum in queue order.

### Questions

- Q21. Which statements about FCFS Scheduling are TRUE?  
  Answer: A, B, C
- Q22. Which statements about SJF Scheduling are TRUE?  
  Answer: A, B, C
- Q23. Which statements about SRTF Scheduling are TRUE?  
  Answer: A, B, C
- Q24. Which statements about Priority Scheduling are TRUE?  
  Answer: A, B, C
- Q25. Which statements about Round Robin Scheduling are TRUE?  
  Answer: A, B, C
- Q52. Which statements about Non-Preemptive Scheduling are TRUE?  
  Answer: A, B, C
- Q53. Which statements about Preemptive Scheduling are TRUE?  
  Answer: A, B, C

## 6. Scheduling Metrics and Gantt Charts

Important formulas:

- Completion Time (CT): time when the process finishes.
- Turnaround Time (TAT): `CT - AT`.
- Waiting Time (WT): `TAT - BT`.
- Response Time (RT): first CPU allocation time minus arrival time.

A Gantt chart shows which process runs during each time interval. It helps calculate completion time and other metrics.

### Questions

- Q26. Which scheduling metric is calculated as CT - AT?  
  Answer: A
- Q27. Which scheduling metric is calculated as TAT - BT?  
  Answer: A
- Q28. Which statements about Burst Time are TRUE?  
  Answer: A, B, D
- Q29. Which statements about Arrival Time are TRUE?  
  Answer: A, B, D
- Q30. Which statements about Completion Time are TRUE?  
  Answer: A, B, D
- Q54. Which statements about Turnaround Time are TRUE?  
  Answer: A, B, C
- Q55. Which statements about Waiting Time are TRUE?  
  Answer: A, B, C
- Q74. Which statements about Response Time are TRUE?  
  Answer: A, B, C
- Q75. Which statements about Gantt Charts in CPU Scheduling are TRUE?  
  Answer: A, B, C

## 7. FCFS Scheduling Numericals

First Come First Served is non-preemptive. Processes execute in increasing arrival order. If no process has arrived yet, the CPU remains idle.

### Questions

- Q31. Using FCFS Scheduling with P1(AT 0, BT 3), P2(AT 1, BT 4), P3(AT 2, BT 2), which statements are TRUE?  
  Answer: A, B, C
- Q32. Using FCFS Scheduling with P1(AT 0, BT 5), P2(AT 2, BT 3), P3(AT 4, BT 1), which statements are TRUE?  
  Answer: A, B, C
- Q56. Using FCFS Scheduling with P1(AT 0, BT 2), P2(AT 2, BT 5), P3(AT 4, BT 1), which statements are TRUE?  
  Answer: A, B, C
- Q76. Using FCFS Scheduling with P1(AT 0, BT 4), P2(AT 4, BT 3), P3(AT 5, BT 2), which statements are TRUE?  
  Answer: A, B, C
- Q77. Using FCFS Scheduling with P1(AT 2, BT 3), P2(AT 5, BT 2), P3(AT 6, BT 1), which statements are TRUE?  
  Answer: A, B, C

## 8. Non-Preemptive SJF Scheduling Numericals

In non-preemptive SJF, once a process starts, it runs until completion. When the CPU becomes free, the ready process with the shortest burst time is selected.

### Questions

- Q33. Using Non-Preemptive SJF with P1(AT 0, BT 4), P2(AT 1, BT 2), P3(AT 2, BT 1), which statements are TRUE?  
  Answer: A, B, C, D
- Q34. Using Non-Preemptive SJF with P1(AT 0, BT 6), P2(AT 2, BT 3), P3(AT 3, BT 2), P4(AT 5, BT 1), which statements are TRUE?  
  Answer: A, B, C, D
- Q57. Using Non-Preemptive SJF with P1(AT 0, BT 8), P2(AT 1, BT 3), P3(AT 2, BT 2), which statements are TRUE?  
  Answer: A, B, C, D
- Q78. Using Non-Preemptive SJF with P1(AT 0, BT 2), P2(AT 1, BT 6), P3(AT 2, BT 3), P4(AT 3, BT 1), which statements are TRUE?  
  Answer: A, D
- Q79. Using Non-Preemptive SJF with P1(AT 1, BT 4), P2(AT 2, BT 2), P3(AT 3, BT 1), which statements are TRUE?  
  Answer: A, B, C, D

## 9. SRTF Scheduling Numericals

Shortest Remaining Time First is preemptive SJF. If a newly arrived process has a shorter remaining time than the current process, it may preempt the current process.

### Questions

- Q35. Using SRTF with P1(AT 0, BT 5), P2(AT 1, BT 2), P3(AT 2, BT 1), which statements are TRUE?  
  Answer: A
- Q36. Using SRTF with P1(AT 0, BT 7), P2(AT 2, BT 4), P3(AT 4, BT 1), which statements are TRUE?  
  Answer: A, B, C
- Q58. Using SRTF with P1(AT 0, BT 4), P2(AT 1, BT 1), P3(AT 2, BT 2), which statements are TRUE?  
  Answer: A, B, C
- Q80. Using SRTF with P1(AT 0, BT 5), P2(AT 1, BT 4), P3(AT 2, BT 1), which statements are TRUE?  
  Answer: A, B, C
- Q81. Using SRTF with P1(AT 0, BT 9), P2(AT 3, BT 2), P3(AT 4, BT 1), which statements are TRUE?  
  Answer: A, B, C

## 10. Priority Scheduling Numericals

Priority Scheduling selects processes based on priority. In these questions, a higher number means higher priority. Priority scheduling may be preemptive or non-preemptive, and starvation can occur.

### Questions

- Q37. Using Non-Preemptive Priority Scheduling with P1(AT 0, BT 4, Priority 2), P2(AT 1, BT 3, Priority 5), P3(AT 2, BT 2, Priority 3), which statements are TRUE?  
  Answer: A, B, D
- Q38. Using Preemptive Priority Scheduling with P1(AT 0, BT 6, Priority 2), P2(AT 1, BT 3, Priority 4), P3(AT 2, BT 2, Priority 5), which statements are TRUE?  
  Answer: A, B, C, D
- Q59. Using Preemptive Priority Scheduling with P1(AT 0, BT 5, Priority 2), P2(AT 2, BT 2, Priority 6), which statements are TRUE?  
  Answer: A, B, D
- Q82. Using Non-Preemptive Priority Scheduling with P1(AT 0, BT 3, Priority 1), P2(AT 1, BT 4, Priority 3), P3(AT 2, BT 2, Priority 5), which statements are TRUE?  
  Answer: A, B, C, D
- Q83. Using Preemptive Priority Scheduling with P1(AT 0, BT 4, Priority 3), P2(AT 1, BT 5, Priority 2), P3(AT 2, BT 1, Priority 6), which statements are TRUE?  
  Answer: A, B, C

## 11. Round Robin Scheduling Numericals

Round Robin uses a queue and a fixed time quantum. Each ready process gets CPU time for at most one quantum. If it is not finished, it goes back to the rear of the queue.

### Questions

- Q39. Using Round Robin with Time Quantum 2 and P1(AT 0, BT 4), P2(AT 1, BT 3), P3(AT 2, BT 2), which statements are TRUE?  
  Answer: A, B, C, D
- Q40. Using Round Robin with Time Quantum 3 and P1(AT 0, BT 5), P2(AT 1, BT 4), which statements are TRUE?  
  Answer: A, B, C, D
- Q60. Using Round Robin with Time Quantum 2 and P1(AT 0, BT 3), P2(AT 1, BT 4), which statements are TRUE?  
  Answer: A, B, C
- Q84. Using Round Robin with Time Quantum 1 and P1(AT 0, BT 2), P2(AT 0, BT 2), P3(AT 0, BT 1), which statements are TRUE?  
  Answer: A, B, C
- Q85. Using Round Robin with Time Quantum 4 and P1(AT 0, BT 3), P2(AT 1, BT 6), P3(AT 2, BT 2), which statements are TRUE?  
  Answer: A, B, C, D

## 12. OOP Basics in Java

A class is a blueprint and an object is an instance of a class. Constructors initialize objects, constructor overloading allows multiple constructors with different parameter lists, `final` methods cannot be overridden, and `super` is used to access parent class behavior or constructors.

### Questions

- Q86. Which statements about Class and Object are TRUE?  
  Answer: A, B, C
- Q87. Which statements about Constructor Overloading are TRUE?  
  Answer: A, B, C
- Q88. Which statements about final methods in Java are TRUE?  
  Answer: A, B, C
- Q89. Which statements about super in method overriding are TRUE?  
  Answer: A, B, D

## 13. Encapsulation and Access Modifiers

Encapsulation means hiding data and giving controlled access through methods. Java access modifiers control visibility: `private` is accessible inside the same class, default/package-private is accessible within the same package, and `protected` allows package access plus subclass access under valid inheritance rules.

### Questions

- Q42. Which statements about Encapsulation are TRUE?  
  Answer: A, B, C
- Q43. A class Learner has a private variable marks and a public method getMarks(). Which OOPS concept is mainly shown here?  
  Answer: A, B
- Q93. A class Account keeps balance private and provides deposit() and getBalance(). Which statements are TRUE?  
  Answer: A, B, C
- Q95. Which statements about Default Access Modifier are TRUE?  
  Answer: A, B, C
- Q96. Which statements about private members are TRUE?  
  Answer: A, B, D
- Q97. Which statements about protected members are TRUE?  
  Answer: A, B, D

## 14. Inheritance, Overriding, and Polymorphism

Inheritance lets a child class reuse parent class properties and behavior. Method overriding lets a child class provide its own implementation of a parent method. Polymorphism allows the same method call to behave differently depending on the actual object.

Static methods are not overridden like instance methods; they may be hidden in a child class.

### Questions

- Q41. A class Animal has a method sound(). Class Dog extends Animal and overrides sound(). Which statements are TRUE?  
  Answer: A, B, C
- Q44. Which statements about Inheritance are TRUE?  
  Answer: A, B, D
- Q48. Which statements about Polymorphism are TRUE?  
  Answer: A, B, C
- Q94. A parent class Employee has method work(). Developer and Designer extend Employee and override work(). Which statements are TRUE?  
  Answer: A, B, C
- Q98. Which statements about Static Method Overriding are TRUE?  
  Answer: A, B, C
- Q99. A class Report has a method print(). Another class DetailedReport extends Report and overrides print(). Which statement is TRUE?  
  Answer: A

## 15. Abstract Classes and Interfaces

An abstract class can contain abstract methods, normal methods, constructors, shared state, and shared behavior. It cannot be directly instantiated, but an abstract class reference can point to a child object.

An interface defines a contract. A class uses `implements` to implement an interface. Interface references can point to implementing class objects and can call methods declared in the interface.

### Questions

- Q45. Which statements about Abstract Classes are TRUE?  
  Answer: A, B, C
- Q46. Which statements about Interfaces are TRUE?  
  Answer: A, B, C
- Q47. A class Payment implements Payable. The interface Payable has a method pay(). Which statements are TRUE?  
  Answer: A, B, C
- Q49. An abstract class Course has one normal method showCourse() and one abstract method startClass(). Class JavaCourse extends Course. Which statements are TRUE?  
  Answer: A, B, D
- Q50. A class Shape has an abstract method area(). Circle and Rectangle extend Shape and define area(). Which statements are TRUE?  
  Answer: A, B, C
- Q90. Which statements about Interface Implementation are TRUE?  
  Answer: A, B, C
- Q91. Which statements about Abstract Class References are TRUE?  
  Answer: A, B, D
- Q92. Which statements about Interface References are TRUE?  
  Answer: A, B, C
- Q100. Which statements about choosing between Interface and Abstract Class are TRUE?  
  Answer: A, B, C

## 16. Simple Round Robin Scheduling Code Using a Queue

This Java implementation uses a `Queue<Process>` for the ready queue. It takes input for processes, applies Round Robin, and prints completion time, turnaround time, waiting time, and average values.

```java
import java.lang.*;
import java.util.*;

class Process {
    int pid;
    int at;
    int bt;
    int rt;
    int ct;
    int tat;
    int wt;

    Process(int at, int bt, int pid) {
        this.pid = pid;
        this.at = at;
        this.bt = bt;
        this.rt = bt;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        Process[] proc = new Process[n];

        for (int i = 0; i < n; i++) {
            int bt = in.nextInt();
            int at = in.nextInt();
            proc[i] = new Process(at, bt, i);
        }

        int tq = in.nextInt();

        Arrays.sort(proc, (a, b) -> {
            if (a.at != b.at) return a.at - b.at;
            return a.pid - b.pid;
        });

        Queue<Process> q = new LinkedList<>();

        int cur = 0;
        int idx = 0;
        int completed = 0;
        double totalWT = 0, totalTAT = 0;

        while (completed < n) {
            while (idx < n && proc[idx].at <= cur) {
                q.add(proc[idx]);
                idx++;
            }

            if (q.isEmpty()) {
                cur = proc[idx].at;
                continue;
            }

            Process p = q.poll();

            int runTime = Math.min(tq, p.rt);
            p.rt -= runTime;
            cur += runTime;

            while (idx < n && proc[idx].at <= cur) {
                q.add(proc[idx]);
                idx++;
            }

            if (p.rt > 0) {
                q.add(p);
            } else {
                p.ct = cur;
                p.tat = p.ct - p.at;
                p.wt = p.tat - p.bt;

                completed++;
                totalWT += p.wt;
                totalTAT += p.tat;
            }
        }

        Arrays.sort(proc, (a, b) -> a.pid - b.pid);

        for (Process p : proc) {
            System.out.print(p.ct + " ");
        }
        System.out.println();

        for (Process p : proc) {
            System.out.print(p.tat + " ");
        }
        System.out.println();

        for (Process p : proc) {
            System.out.print(p.wt + " ");
        }
        System.out.println();

        System.out.printf("%.2f %.2f", totalWT / n, totalTAT / n);
    }
}
```

Key idea:

```java
Process p = q.poll();
run for min(timeQuantum, remainingTime);
if still remaining, add back to queue;
else calculate CT, TAT, WT;
```
