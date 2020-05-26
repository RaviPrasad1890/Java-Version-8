package com.ravi.version_8;

@java.lang.FunctionalInterface//Optional, on;ly for compiler instruction
public interface FunctionalInterface {
    //We can Invoke lamnda functions by using Functional Interface
    //Only one abstract method
    public void m1();
    //May contain default and static method
    default void m2(){
        System.out.println("I am default method");
    }

    public static void m3(){
        System.out.println("I am static method");
    }
}

/*
If we are using @FunctionalInterface annotaion on parent and child interface than:-

1.If an interface extends fuctional interface, and child interface does not contain any abstract method
than child interface is always a functional interface.

2.In child interface, we can define exactly same parent interface abstract method.

3.In Child Interface, we wont be able to define any new abstract methods, otherwise we will get CE


*/

