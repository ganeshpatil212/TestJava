package com.gs.test;

class Parent {

    // Static variable
    static int ps = initStaticParent();

    // Static block
    static {
        System.out.println("Parent static block");
    }

    // Instance variable
    int pi = initInstanceParent();

    // Instance block
    {
        System.out.println("Parent instance block");
    }

    // Constructor
    Parent() {
        System.out.println("Parent constructor");
    }

    static int initStaticParent() {
        System.out.println("Parent static variable initialized");
        return 10;
    }

    int initInstanceParent() {
        System.out.println("Parent instance variable initialized");
        return 20;
    }
}
