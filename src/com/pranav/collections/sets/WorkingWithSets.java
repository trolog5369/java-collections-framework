package com.pranav.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class WorkingWithSets {
    public static void main(String[] args) {
        // To  create a set use the 
        // Set<Balls> balls=new TreeSet<>();
        // Bcked by Tree set

        // Set<Balls> balls=new HashSet<>();
        // Backed by Hash set

        // We have created a Set
        Set<Balls> balls=new HashSet<>();

        // To add the elements use the add()
        balls.add(new Balls("Blue"));
        balls.add(new Balls("Blue"));//duplicate set!
        balls.add(new Balls("Yellow"));
        balls.add(new Balls("Red"));

        System.out.println(balls);
        // [Balls[color=Red], Balls[color=Blue], Balls[color=Yellow]]
        // Even tho blue is repeated the output duplicate is not counted!

        // We can't get a particular ball there isn't a get () as it's Sets and they don't gurantee order!

        // To loop thr the Sets:

        balls.forEach(System.out::println);
        // Balls[color=Red]
        // Balls[color=Blue]
        // Balls[color=Yellow]
        // Even tho we added blue,yellow,red the order is differnet! ie it is not guranteed!

        // To check the size use the size()
        System.out.println(balls.size());

        // to remove the element use the remove()
        balls.remove(new Balls("red"));
        // The duplicate is removed of red
        
        System.out.println(balls);
    }
    record Balls(String color){

    }
}
