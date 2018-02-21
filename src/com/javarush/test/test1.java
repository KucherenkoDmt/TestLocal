package com.javarush.test;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;


public class test1 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat1 = new Cat("Вася",5, 4, 3);
        Cat cat2 = new Cat("Вася",4, 6, 5);
        Cat cat3= new Cat("Вася",6, 3, 4);
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);
    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}

