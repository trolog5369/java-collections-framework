package com.pranav.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueue {
    public static void main(String[] args) {
        // To create a Queue use the Queue but it isn't generic

        Queue<Person> supermarket=new LinkedList<>();

        // To add the element in the queue use the add()
        supermarket.add(new Person("Alex", 21));
        supermarket.add(new Person("Mariam", 19));
        supermarket.add(new Person("Ali", 40));

        // To get the size of the queue use the size ()
        System.out.println(supermarket.size());
        // 3

        System.out.println(supermarket.peek());
        // Returns the element which is First inputted but does not remove the element ie Alex 
        // Person[name=Alex, age=21]

        System.out.println();

        // To remove the element use the poll()
        System.out.println(supermarket.poll());
        // Person[name=Alex, age=21] alex is removed from the lsit as he's was the first

        // Checking the size again after removing alex
        System.out.println(supermarket.size());
        // 2

        System.out.println(supermarket.peek());
        //Person[name=Mariam, age=19]  now Marim is first as alex was removed

        // THIS IS HOW WE USE THE QUEUE WITH THE LINKED-LIST IMPLEMENTATION

    }
    static record Person(String name,int age){

    }
}
