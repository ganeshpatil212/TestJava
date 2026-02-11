package com.gs.test;

class Child extends Parent {

    // Static variable
    static int cs = initStaticChild();

    // Static block
    static {
        System.out.println("Child static block");
    }

    // Instance variable
    int ci = initInstanceChild();

    // Instance block
    {
        System.out.println("Child instance block");
    }

    // Constructor
    Child() {
        super(); // implicit, written for clarity
        System.out.println("Child constructor");
        System.out.println("Access using super: pi = " + super.pi);
        System.out.println("Access using this:  ci = " + this.ci);
    }

    static int initStaticChild() {
        System.out.println("Child static variable initialized");
        return 30;
    }

    int initInstanceChild() {
        System.out.println("Child instance variable initialized");
        return 40;
    }

    public static void main(String[] args) {
        System.out.println("Main method");
        Child obj = new Child();
    }
}
