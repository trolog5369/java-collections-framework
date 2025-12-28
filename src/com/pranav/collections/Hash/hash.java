package com.pranav.collections.Hash;

public class hash {
    public static void main(String[] args) {
        // Hash function produces HashCode
        // Hashcode:Mapping an object to it's intergar value

        // HashFunction on the same object it will always produce the same HashCode

        // HashFunction->HashCode

        // eg:
        // A] map.put(1,"Hello")
        // 1 is key and Value is "Hello"

        // it goes into the HashFunction which produces it into HashCode ie 1 (for eg)
        // Hence,
        //     Map
        // Keys   Value
        // 1      "Hello"

        // B]map.put(new Person("Jamilia"),new Diamond())
        // Jamilia is key and value is Diamond()
        
        // it goes into the HashFunction which produces it into HashCode ie -2083476985 (for eg)
        // Hence,
        //            Map
        //  Keys           Value
        // -2083476985    Diamond

        // HashFunction on the same object will always produce the same HashCode ie even if we call Jamalia 
        // Millions of time the we will get the same HashCode ie -2083476985

        // Hence Lookups are very fast in Maps and HashCodes

        // Why we need to override the equals() and HashCode()

    }
}
