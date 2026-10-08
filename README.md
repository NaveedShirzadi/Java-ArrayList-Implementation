# Data Structures: Linked List, Stack, and Queue (Java)

Java implementations of three core data structures, plus driver programs that use them in small real world scenarios.

This repository is named "ArrayList Implementation," but the work here is the linked list, stack, and queue. The array backed list is in the Java-Object-Oriented-Programming repository.

## What is inside

| File | What it is |
|---|---|
| `CSLinkedList.java` | A generic linked list that extends `AbstractList`, with its own iterator |
| `StackInt.java` | The stack interface |
| `ListStack.java` | A stack built on top of a `List`, with the list hidden from the user |
| `ArrayQueue.java` | A queue stored in a circular array, extending `AbstractQueue` |
| `CSLinkedListDriver.java` | Ten linked list scenarios, such as a playlist, a to do list, and a course waitlist |
| `ListStackDriver.java` | Nine stack scenarios, such as a browser back button, text editor undo, and balanced parentheses |
| `ArrayQueueDriver.java` | Nine queue scenarios, such as a print queue, a call center, and a round robin service |
| `run.sh`, `run.bat` | Scripts that compile everything and run one driver |
| `RUN_INSTRUCTIONS.md` | Step by step directions for the scripts |

## How to run

You need a JDK (the `javac` command).

On macOS or Linux:

```
chmod +x run.sh
./run.sh queue
```

On Windows:

```
run queue
```

Use `list`, `stack`, `queue`, or `all` to choose a driver.

Each driver's `main` method has a list of scenario calls that are commented out. Uncomment the one you want to run. The queue driver currently has the round robin scenario turned on, which serves three people in turns for five rounds. The linked list and stack drivers print nothing until you uncomment a scenario.

## Requirements

Java 8 or newer. There are no outside libraries.
