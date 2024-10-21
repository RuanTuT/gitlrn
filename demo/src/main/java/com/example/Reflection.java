package com.example;

import java.lang.reflect.Field;
//import com.example.Person;
public class Reflection {

    public static void main(String[] args) throws Exception {
        Object p = new Person("Xiao Ming");
        Class c = p.getClass();
        Field f = c.getDeclaredField("name");
        f.setAccessible(true);
         Object value = f.get(p);
        System.out.println(value); // "Xiao Ming"
        System.out.println(c.getDeclaredField("name"));
    }
}


