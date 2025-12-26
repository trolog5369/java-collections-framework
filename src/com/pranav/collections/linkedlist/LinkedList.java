package com.pranav.collections.linkedlist;

public class LinkedList {
    public static void main(String[] args) {
        // It is an implementation of Queue 

        // It is made up multiple nodes in a nutshell where you got the head and tail
        // Each node contain refrence to previous node and the next one

        // Example:

        //                 next next   next
        //  null-->1(head)---->2---->3---->4(tail)-->null
        //                prev   prev   prev

        //1,2,3,4 are nodes

        // This data structure is called the Doubly LinkedList as it is uni-Directional
        // ie we got ref to both previous and next node
        // If the ref was unidirectional then it is LinkedList

        // LinkedList are very expensive on memory as we need to keep the Refrence 
        // Memory is not a concern NowDays 

        // If we wanna add a node to the LinkedList we have to change/upadte the refrence
        // ie change the next and previous node refrences

    }
}
