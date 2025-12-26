# Java LinkedList

This module covers the fundamentals of **LinkedList** in Java, including its internal structure, characteristics, and common operations.

---

## What is a LinkedList?

A **LinkedList** is a data structure made up of **nodes**.

Each node contains:
- Data
- A reference to the **next** node
- A reference to the **previous** node (in Java’s implementation)

Java uses a **Doubly Linked List** internally.

Example structure:

null ← 1 ←→ 2 ←→ 3 ←→ 4 → null  
(head)                        (tail)

---

## Key Characteristics

- Implements `List`, `Queue`, and `Deque`
- Not backed by an array
- Each element is a separate node
- Nodes are linked using references
- Order is maintained
- Allows duplicates

---

## Singly vs Doubly Linked List

- **Singly Linked List**
  - Only reference to next node
- **Doubly Linked List (Java LinkedList)**
  - Reference to both previous and next nodes
  - Allows forward and backward traversal

---

## Memory Consideration

LinkedList uses **more memory** than ArrayList because:
- Each node stores extra references (prev & next)

In modern systems, memory is usually not a concern, but performance trade-offs still matter.

---

## When to Use LinkedList

Use LinkedList when:
- Frequent insertions and deletions are required
- Operations at the beginning or end are common
- You need queue or deque behavior

Avoid LinkedList when:
- Frequent random access is required
- Performance-critical read operations matter

---

## Operations Covered

### Adding elements
- `add(element)`
- `addFirst(element)`
- `addLast(element)`

### Traversal
- Forward traversal using `ListIterator`
- Reverse traversal using `ListIterator`

---

## Traversal Example

- Forward iteration using `hasNext()` and `next()`
- Backward iteration using `hasPrevious()` and `previous()`

This is possible because LinkedList is **doubly linked**.

---

## LinkedList vs ArrayList (Quick Comparison)

- LinkedList
  - Slower random access
  - Faster insertions/deletions
  - Higher memory usage

- ArrayList
  - Faster random access
  - Slower insertions/deletions in middle
  - Lower memory overhead

---

## Important Notes

- LinkedList is **not thread-safe**
- Implements Queue directly
- Often used as Queue or Deque
- For most cases, ArrayList is preferred unless LinkedList behavior is specifically needed

---

## What I Learned

- Internal structure of LinkedList
- Difference between singly and doubly linked lists
- Forward and backward traversal
- When and when not to use LinkedList
- Memory and performance trade-offs
