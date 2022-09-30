package com.pokemon.api;

public class Main {

    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = t1;
        System.out.println(t1 == t2);
        System.out.println(t1 == t3);
        System.out.println(t1.equals(t2));
        System.out.println(t1.equals(t3));
    }

}
class Test {

}
