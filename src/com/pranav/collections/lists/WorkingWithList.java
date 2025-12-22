package com.pranav.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithList {
    public static void main(String[] args) {
        // There are many implementation of Lists in java
        // Such as ArrayList,LinkedList,Vector etc

        List<String> colors=new ArrayList<>();
        colors.add("blue");
        colors.add("purple");
        colors.add("Yellow");

        // colors.add(1);//This is invalid as the list only contain Strings datatype <>

        System.out.println(colors);
        // [blue, purple, Yellow]

        // To check the size of the List use the size ()
        System.out.println(colors.size());
        // 3

        // To check is the list contain any element use contains() returns boolean
        System.out.println(colors.contains("orange"));
        // false

        // Looping thr an list by an enhance for loop
        for (String hehe:colors) {
            System.out.println(hehe);
        }

        System.out.println();

        // Looping thr an list by an for each loop
        colors.forEach(System.out::println);

        System.out.println();

        // By using traditional for loop
        for(int i=0;i<colors.size();i++){
            System.out.println(colors.get(i));
        }

        //Always the interface type ie List
        // beacuse in this program we used 
        // List<String> colors=new ArrayList<>();

        // While this also works 
        // ArrayList colors=new ArrayList<>();
        // But it does not give you multiple behaviour as the Above list used generics but this is only
        // Specifically for ArrarList


        System.out.println();
        // If we want to construct a List:
        // This an Unmodifiable List*
        List<String> colorsUnmodifiable=List.of(
            "blue",
            "yellow"
        );
        // colorsUnmodifiable.add("pink");
        // This will not work as throw an error as This list is unModifiable

        System.out.println(colorsUnmodifiable);

    }
}
