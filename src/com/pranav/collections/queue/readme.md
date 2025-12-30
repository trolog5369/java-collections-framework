
---

# Java Queue (FIFO) — Day Progress Notes

## Topic Covered

**Queue Interface with LinkedList implementation**

This module focuses on understanding the **Queue** data structure in Java, its behavior, and basic operations using `LinkedList`.

---

## Java Queue (FIFO)

## What is a Queue?

A **Queue** follows the **FIFO** principle:

**First In → First Out**

* The element added first is processed/removed first
* Opposite of Stack (**LIFO**)

---

## Real-World Analogy

Think of a **supermarket billing line**:

* First person in line → first person served
* Last person in line → last person served

This is exactly how a Queue works.

---

## Key Characteristics of Queue

* Designed to hold elements **before processing**
* Maintains insertion order
* Commonly used in:

  * Printer job scheduling
  * Task scheduling
  * Message queues
  * Producer–Consumer problems

---

## Queue in Java

* `Queue` is an **interface**
* Common implementations:

  * `LinkedList`
  * `PriorityQueue`
  * `ArrayDeque`

In this module, **LinkedList** is used.

---

## Why LinkedList for Queue?

* Efficient insertion and removal at both ends
* Naturally fits FIFO behavior
* Implements the `Queue` interface directly

---

## Operations Covered

### Adding Elements

```java
queue.add(element);
```

### Viewing the Front Element (Without Removing)

```java
queue.peek();
```

### Removing the Front Element

```java
queue.poll();
```

### Getting Queue Size

```java
queue.size();
```

---

## Behavior Summary

* `add()` → inserts element at the end
* `peek()` → shows the first element (does not remove)
* `poll()` → removes and returns the first element
* Queue always processes elements in FIFO order

---

## Important Notes

* Queue is an interface, not a concrete class
* LinkedList is commonly used but not thread-safe

For thread-safe queues, use:

* `ConcurrentLinkedQueue`
* Other classes from `java.util.concurrent`

---

## Stack vs Queue (Quick Reminder)

* **Stack** → LIFO (Last In First Out)
* **Queue** → FIFO (First In First Out)

---

## What I Learned Today

* Concept of Queue and FIFO
* Difference between Stack and Queue
* How to use Queue with LinkedList
* Core Queue operations (`add`, `peek`, `poll`, `size`)
* Real-world use cases of Queue

---


