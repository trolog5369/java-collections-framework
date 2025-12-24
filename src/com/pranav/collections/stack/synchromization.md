# Synchronized in Java (Simple & Clear Notes)

## What does `synchronized` mean?

**Synchronized = only ONE thread can use the data at a time.**

That’s the core idea. Everything else is detail.

---

## What is a thread?

A **thread** is one path of execution.

- **Single-threaded** → one task at a time  
- **Multi-threaded** → multiple tasks running at the same time  

In Java, many programs are **multi-threaded by default**.

---

## The problem synchronization solves

Imagine **two threads accessing the same data**.

### Example: Shared counter

**Thread A**
- Reads value = 5  
- Adds 1  
- Writes value = 6  

**Thread B (at the same time)**
- Reads value = 5  
- Adds 1  
- Writes value = 6  

**Expected result:** 7  
**Actual result:** 6  

❌ This problem is called a **race condition**.

---

## What `synchronized` does

`synchronized` puts a **lock** on the data.

Think of it like a **single-person washroom 🚽**:

- If Thread A enters → Thread B must wait  
- When Thread A exits → Thread B can enter  

So **no two threads modify the same thing at the same time**.

---

## Simple mental model

**Synchronized = “Wait your turn.”**

No shortcuts.  
No overlap.

---

## Why Stack and Vector are synchronized

- `Stack` extends `Vector`  
- `Vector` is synchronized  
- So **every operation is locked**

### Example operations
- `push()`
- `pop()`
- `add()`
- `remove()`

### Result
- One thread at a time  
- Safe ✅  
- Slow ❌  

---

## Why synchronized is slower

Because threads are **waiting instead of working**.

Performance cost comes from:
- Lock acquisition  
- Lock release  
- Context switching  

That’s why:
- `ArrayList` → ❌ not synchronized → **fast**  
- `Vector / Stack` → ✅ synchronized → **slow**

---

## When synchronization is actually needed

Use synchronization **ONLY IF**:
- Multiple threads  
- Shared mutable data  
- Concurrent modification  

### Examples
- Banking systems  
- Server applications  
- Multi-user systems  

---

## When synchronization is NOT needed (our case right now)

- Single-threaded programs  
- Learning Java  
- JDBC basics  
- Collections practice  
- DSA preparation  

---

## Modern Java approach (important)

Instead of old synchronized classes:

- `ArrayList` + manual synchronization  
- OR `Collections.synchronizedList()`  
- OR **Concurrent collections**
  - `ConcurrentHashMap`
  - Other `java.util.concurrent` classes  

### For stack behavior
- ❌ `Stack`  
- ✅ `ArrayDeque`  

---

## One-line exam / interview answer

**Synchronization ensures that only one thread can access a shared resource at a time to prevent data inconsistency.**
