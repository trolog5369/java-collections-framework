package com.pranav.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class WokringWithMaps {
    public static void main(String[] args) {
        // To create a Map use the map keyword
        Map<Integer,Person> map=new HashMap<>();

        // To add elements use the put()
        map.put(0, new Person("Lol"));
        map.put(1, new Person("Alex"));
        map.put(2, new Person("Jasmine"));
        map.put(3, new Person("Mariam"));

        // The keys must be different in the map as it's the unique identifier

        System.out.println(map);
        // {0=Person[name=Lol], 1=Person[name=Alex], 2=Person[name=Jasmine], 3=Person[name=Mariam]}

        // To remove the key use the remove()
        System.out.println(map.remove(0));
        // Person[name=Lol]

        // What if there's a dupliacate key?
        map.put(3, new Person("Mariam"));
        System.out.println(map);
        // {1=Person[name=Alex], 2=Person[name=Jasmine], 3=Person[name=Mariam]}
        // Even tho there is Duplicate key it is not include in the Output

        // If the name is changed ie value then the most recent overrides the previous
        map.put(3, new Person("Mariam2"));
        System.out.println(map);
        // {1=Person[name=Alex], 2=Person[name=Jasmine], 3=Person[name=Mariam2]}
        // Marim is replaced by Marim2

        // Hence the keys must be unique or the values can be overridden!

        // To check the elements use the size()
        System.out.println(map.size());
        // 3

        // To get an value at a specific key use the map.get()
        System.out.println(map.get(1));
        // Person[name=Alex]

        // To check is the key is valid/present or not use the containsKey()
        System.out.println(map.containsKey(4));
        // false

        // To get the key in the HashMap use the KeySet()
        System.out.println(map.keySet());
        // [1, 2, 3]

        // To get the entries in the HashMap use the entrySet()
        System.out.println(map.entrySet());
        // [1=Person[name=Alex], 2=Person[name=Jasmine], 3=Person[name=Mariam2]]

        // To get only values in the map use the values()
        System.out.println(map.values());

        //Looping thr the map
        // using the foreach loop
        map.entrySet().forEach(System.out::println);

        // if we wanna check if the key is present and if not then we have to give it a default value then
        // we use getOrDefault() it check is the key is present if not it prints the default value given by user
        System.out.println(map.getOrDefault(4, new Person("Default")));
        // Key 4 is not present hence it gave the default value which was pre-assigned!
        // Person[name=Default]
    }
    record Person(String name){

    }
}
