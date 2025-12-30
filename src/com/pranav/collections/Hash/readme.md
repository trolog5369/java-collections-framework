# 🔑 Hashing in Java — hashCode() & equals()

## What is Hashing?

**Hashing** is the process of converting an object into an **integer value**, called a **hash code**.

- A **hash function** generates a hash code
- Hash codes are used internally by hash-based collections like:
  - `HashMap`
  - `HashSet`

---

## What is hashCode()?

- `hashCode()` returns an **integer representation** of an object
- The **same object state must always produce the same hash code**
- Different objects *can* produce the same hash code (collision)

Example:
```java
new Person("Jamalia").hashCode();
```
Calling this multiple times produces the same integer.
```
Why Hashing Exists

Hash-based collections use hashing for fast lookup.

Instead of scanning every element:

The key is converted to a hash code

The hash code decides where the data is stored

Lookup becomes nearly O(1)

That’s why HashMap is fast.
How HashMap Uses hashCode()

When you do:

map.put(key, value);


Internally:

key.hashCode() is called

Hash code decides the bucket

Value is stored there

When you do:

map.get(key);


Internally:

key.hashCode() is called again

Same bucket is found

equals() is used to find the exact key

equals() and hashCode() Contract
If two objects are equal, then:
obj1.equals(obj2) == true

Then:
obj1.hashCode() == obj2.hashCode()

⚠️ If this contract is broken → HashMap fails silently.

Why equals() Must Be Overridden
Without overriding equals():

Java compares memory references

Two different objects with same data are considered not equal

Example:
new Person("Jamalia") != new Person("Jamalia")

Unless equals() is overridden.

Why hashCode() Must Be Overridden
If only equals() is overridden:

HashMap finds the wrong bucket

get() returns null even if the key exists

This is why both must be overridden together.

Correct Implementation Pattern
@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Person person = (Person) o;
    return Objects.equals(name, person.name);
}

@Override
public int hashCode() {
    return Objects.hash(name);
}


What Happens Without Overriding

Different hash codes for same logical data

map.get(new Key()) returns null

Debugging nightmare

Silent bugs (worst kind)

Key Takeaways
Hashing maps objects → integers

HashMap relies on hashCode first, equals second

Same logical object → same hash code

Always override:
equals()
hashCode()

Never override one without the other

One-Line Interview Answer
hashCode() decides the bucket, equals() decides the match.


Rule:
If an object is used as a key in a HashMap → override equals() and hashCode() or don’t use it as a key at all.


---





