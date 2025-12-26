package com.pranav.collections.linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;
public class WorkingWithLinkedList {
    public static void main(String[] args) {
        // LinkedList is a implementation of the Queue interface
        LinkedList<Person> linkedList=new LinkedList<>();

        // To add the elements in the LinkedList use the add()
        linkedList.add(new Person("Alex",21));
        linkedList.add(new Person("Jasmine",21));

        // To add the elements First or Last in the LinkedList use the addFirst() and AddLast()
        linkedList.addFirst(new Person("Ali", 18));
        // Now ali is added first in the list instaed of Alex!

        linkedList.addLast(new Person("Peter", 25));
        // Now peter is added last in the list instaed of Jasmine!

        // If we want to loop thr the LinkedList

        // WE can use forEach
        // linkedList.forEach();

        // isLiterator()

        // To get the list in next order use ie Forward
        ListIterator<Person> personListLiterator=linkedList.listIterator();
        while (personListLiterator.hasNext()) {
            System.out.println(personListLiterator.next());
        }
        // Person[name=Ali, age=18]
        // Person[name=Alex, age=21]
        // Person[name=Jasmine, age=21]
        // Person[name=Peter, age=25]

        System.out.println();

        // To get the list in reverse order use ie Backwards
        while (personListLiterator.hasPrevious()) {
            System.out.println(personListLiterator.previous());
        }
        // Person[name=Peter, age=25]
        // Person[name=Jasmine, age=21]
        // Person[name=Alex, age=21]
        // Person[name=Ali, age=18]

        // If we want more functionality then use LinkedList instaed of using the class Queue directly 
        // Just keep one thing in mind Using Linkedlist is a bit costly ie internally it uses DoublyLinkedList
        // ie uses pointer to pointer to nxt element and previous element which add additional data in memory
    }
    static record Person(String name,int age){

    }
}
