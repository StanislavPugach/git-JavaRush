package com.javarush.test.level06.lesson05.task01;

/* Метод finalize класса Cat
В классе Cat создать метод protected void finalize() throws Throwable
*/

public class Cat
{
    String name;
    Cat(String name){
        this.name = name;
    }
    protected void finalize() throws Throwable{
        super.finalize();
        System.out.println(name+" WTF");
    }

}

