package com.pranav.collections.Hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WorkingWithHash {
    public static void main(String[] args) {
        // WE have created a Map using the HashCode`
        Map<Person,Diamond> map=new HashMap();

        map.put(new Person("Jamalia"),new Diamond("African Diamond"));
        // We have created a map whose key is Person("Jamilia") and key Diamond("African Diamond")

        System.out.println(map.get(new Person("Jamalia")));

        System.out.println(new Person("Jamalia").hashCode());
        System.out.println(new Person("Jamalia").hashCode());
        // -163516008
        // -163516008
        // Now these objects are completely different
        // But as we invoked the hashCode now they're the same ie it lookup the hash not the object in it!
        // Ie both of these will have same HashCode

        // if we didn't override the hashCode() then we will get different HashCodes
        // -163516008
        // 146589023
        
    }
    static class Person{
        String name;
        public Person(String name){
            this.name=name;
        }
        @Override
        public String toString(){
            return "Person{" +
            "name"+name+'\''+
            '}';
        }

        // This 2 meethods we override to not get the Null value
        @Override
        public boolean equals(Object o){
            if (this==o) return true;
            if(o==null || getClass() != o.getClass()) return false;
            Person person=(Person) o;
            return Objects.equals(name, person.name);
        }
        @Override
        public int hashCode(){
            return Objects.hash(name);
        }
    }
    public record Diamond(String name) {}
}
