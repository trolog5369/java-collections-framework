# 🗺️ Java Collections — Map

## What is a Map?

A **Map** is a collection of **key–value pairs**.

- Each **key is unique**
- Each key maps to **at most one value**
- **Values can be duplicated**
- Keys act as **identifiers**

Example:
Key → Value
1 → Alex
2 → Jasmine
3 → Mariam


---

## Key Characteristics of Map

- ❌ No duplicate keys
- ✅ Duplicate values allowed
- ❌ No index-based access
- ✅ Fast lookup using keys
- ❌ Not part of the `Collection` interface

---

## Map in Java

- `Map` is an **interface**
- Common implementations:
  - `HashMap`
  - `LinkedHashMap`
  - `TreeMap`
  - `Hashtable` (legacy)

In this module, **HashMap** is used.

---

## Common Map Implementations (Quick Overview)

- **HashMap**
  - Allows one `null` key
  - No order guarantee
  - Fast (`O(1)` average)

- **LinkedHashMap**
  - Maintains insertion order
  - Slightly slower than HashMap
  - Internally uses a doubly linked list

- **TreeMap**
  - Sorted by keys
  - No `null` keys allowed
  - Backed by Red-Black Tree

- **Hashtable**
  - Thread-safe (synchronized)
  - No `null` keys or values
  - Legacy and rarely used

---

## Operations Covered

### Creating a Map
```java
Map<Integer, Person> map = new HashMap<>();

Adding elements
map.put(1, new Person("Alex"));


If the key already exists → value is overwritten

Removing elements
map.remove(1);

Accessing a value
map.get(1);

Checking key existence
map.containsKey(4);

Getting size
map.size();

Retrieving keys, values, and entries
map.keySet();     // All keys
map.values();     // All values
map.entrySet();   // Key–value pairs

Iterating through a Map
map.entrySet().forEach(System.out::println);

Default value handling
map.getOrDefault(4, new Person("Default"));

Returns the default value if the key is absent.

Important Notes

Duplicate keys are not allowed

Adding a duplicate key replaces the old value

Maps are ideal for lookup-based problems

HashMap does not guarantee order

What I Learned Today

What a Map is and why it exists

Difference between keys and values

Why keys must be unique

How HashMap handles duplicates

Core Map operations and traversal

When to use Map instead of List or Set

List vs Set vs Map (Final Recall)

List → Ordered, allows duplicates

Set → No duplicates, no order

Map → Key–value pairs, unique keys

Rule of thumb:
If you need fast lookup by an identifier → use a Map