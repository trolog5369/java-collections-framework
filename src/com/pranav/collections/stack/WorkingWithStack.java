package com.pranav.collections.stack;

import java.util.Stack;
public class WorkingWithStack {
    public static void main(String[] args) {
        // to create a Stack use the Stack keyword
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(4);

        // 3 is at the top of the last as it was added last 

        // to peek ie view the last element of the stack(Top element at the stack) use the peek()
        System.out.println(stack.peek());
        // It do not remove the element 

        // To check the size of the stack use the size()
        System.out.println(stack.size());

        // To pop the element form the stack use the pop() 
        // it pops the top most element ie last element entered in the stack
        System.out.println(stack.pop());
        // 4 is popped as it was the last element to be enetered

        System.out.println(stack.size());
        // new size=2

        // To check is the stack is empty use the isEmpty() it returns boolean
        System.out.println(stack.isEmpty());
        // false

        // To search the element in the stack use the search() 
        System.out.println(stack.search(1));
        System.out.println(stack.search(0));//not found hence -1

        // Returns position from top (1-based), or -1 if not found

        // Stack are very straight forward to use in java

        // In the Stack class whenever we call the push ()
        // it calls the addElement(item); which comes from vector ie java.util.Vector
        // beacuse it implements the vector Class
        // Vector is synchronized

        // The diff between the ArrayList and Vector is 
        // Vector is syncronized 

        // Synchronized = only ONE thread can use the data at a time.

        // Synchronized is when we are working in a multi thread enviroment when any access to your stack has to be synchronized
        // This basically slow down the operations so we have to check when to use the Stack

        // if a thread safe implementation is not needed we use ArrayList instaed of Vector

        // STACK implements VECTOR and VECTOR extends LIST
    }
}
