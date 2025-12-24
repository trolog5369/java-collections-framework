# Java Stack (LIFO)

This module covers the **Stack** data structure in Java, its behavior, internal implementation, and commonly used operations.

---

## 📌 What is a Stack?

A **Stack** is a linear data structure that follows the **LIFO (Last-In, First-Out)** principle.

**Real-world analogy:**  
A packet of Pringles — the last chip placed inside is the first one taken out.

---

## 📌 Java Stack Class

In Java, `Stack` is a class from `java.util` that:

- Represents a **LIFO stack of objects**
- **Extends `Vector`**
- Inherits synchronization behavior from `Vector`
- Is part of the **Java Collections Framework**

```java
Stack<Integer> stack = new Stack<>();

📌 Core Stack Operations
MethodDescriptionpush(E item)Inserts an element at the top of the stackpop()Removes and returns the top elementpeek()Returns the top element without removing itisEmpty()Checks whether the stack is emptysize()Returns the number of elements in the stacksearch(Object o)Returns position from top (1-based), or -1 if not found

📌 Example Usage
Stack<Integer> stack = new Stack<>();

stack.push(1);
stack.push(2);
stack.push(4);

System.out.println(stack.peek());   // 4
System.out.println(stack.pop());    // 4
System.out.println(stack.size());   // 2
System.out.println(stack.isEmpty()); // false


📌 Internal Working (Important)


Stack extends Vector


push() internally calls addElement()


Vector is synchronized


This makes Stack thread-safe, but slower than non-synchronized collections


📌 Stack vs ArrayList / Vector

Stack
- Thread-safe
- Synchronized
- Slower due to synchronization
- Used for LIFO (Last-In, First-Out) operations

Vector
- Thread-safe
- Synchronized
- Slower performance
- Considered a legacy thread-safe list implementation

ArrayList
- Not thread-safe
- Not synchronized
- Faster than Stack and Vector
- Used as a general-purpose dynamic array

---

⚠ Important Notes

- Stack is a legacy class and is rarely used in modern Java applications
- Stack extends Vector, which is synchronized and causes performance overhead
- For stack-like behavior in real-world applications:
  - Prefer using Deque (specifically ArrayDeque)
- Stack is still important for:
  - Understanding LIFO concepts
  - Learning internal working of Java collections
  - Interview preparation

---

✅ Summary

- Stack follows the LIFO (Last-In, First-Out) principle
- Provides core operations such as:
  - push
  - pop
  - peek
- Internally backed by the Vector class
- Thread-safe by default but slower due to synchronization
- Best used for learning and conceptual clarity before moving to Deque
