# Java List & ArrayList

This module covers the fundamentals of the `List` interface and its most commonly used implementation, `ArrayList`.

## 📌 What is a List?
- An **ordered collection** (sequence)
- Allows **duplicate elements**
- **Not fixed in size** (unlike arrays)
- Provides **index-based access**
- Part of the **Java Collections Framework**

## 📌 Common Implementations
- `ArrayList`
- `LinkedList`
- `Vector`
- `Stack`

## 📌 ArrayList Characteristics
- Backed internally by a **dynamic array**
- Fast **random access** using `get(index)`
- Slower **insertions and deletions in the middle** compared to `LinkedList`

## 📌 Why Use `List` Instead of `ArrayList` Directly?
Always program to the **interface**, not the implementation.

```java
List<String> colors = new ArrayList<>();

This allows switching implementations later without changing business logic.

📌 Operations Covered

Adding elements using add()

Getting size using size()

Searching elements using contains()

Iteration using:

Enhanced for-loop

forEach() method

Traditional for-loop

Creating unmodifiable lists using List.of()

⚠ Important Notes

Lists created using List.of() are immutable

Any attempt to modify them will throw UnsupportedOperationException

“Fast retrieval” applies specifically to ArrayList, not all List implementations