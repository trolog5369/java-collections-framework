# 📦 Java Collections — Set

## What is a Set?

A **Set** is a collection that **does NOT allow duplicate elements**.

- Each element is **unique**
- Order is **NOT guaranteed**
- Models the **mathematical set** concept

Formally:
- No two elements `e1` and `e2` such that `e1.equals(e2)`
- At most **one `null` element** (depends on implementation)

---

## Key Characteristics of Set

- ❌ No duplicates
- ❌ No index-based access
- ❌ No guaranteed order
- ✅ Fast lookups (depending on implementation)
- ✅ Ideal when uniqueness matters

---

## Real-World Analogy

Think of a **bag of colored balls**:
- You don’t know the order
- You can’t pick “the 2nd ball”
- You can’t have two identical balls

That’s exactly how a Set behaves.

---

## Set in Java

- `Set` is an **interface**
- Common implementations:
  - `HashSet`
  - `LinkedHashSet`
  - `TreeSet`

In this module, **HashSet** is used.

---

## Why HashSet?

- Does NOT maintain insertion order
- Does NOT allow duplicates
- Fast operations (`O(1)` average case)
- Backed internally by a **HashMap**

---

## Operations Covered

### Creating a Set
```java
Set<Balls> balls = new HashSet<>();

Adding elements
balls.add(new Balls("Blue"));


Duplicate elements are ignored automatically.

Iterating over a Set
balls.forEach(System.out::println);


Order is not guaranteed.

Removing elements
balls.remove(new Balls("Red"));

Getting size
balls.size();

Important Notes

No get() method → Sets don’t use indexes

Order may change between runs

Equality depends on equals() and hashCode()

Sets are best when uniqueness matters more than order

What I Learned Today

What a Set is and why it exists

Why Sets don’t allow duplicates

Difference between List and Set

How HashSet behaves internally

How to add, remove, iterate, and check size

Stack vs Queue vs Set (Quick Recall)

Stack → LIFO

Queue → FIFO

Set → Unique elements, no order

Rule of thumb:
If duplicates are a problem → use a Set
If order matters → use a List