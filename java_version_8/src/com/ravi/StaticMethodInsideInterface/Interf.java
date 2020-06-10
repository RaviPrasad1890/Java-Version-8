package com.ravi.StaticMethodInsideInterface;

public interface Interf {
    public static void staticMethodOfInterf(){
        System.out.println("Interface Static Method");
    }

    public static void main(String[] args){
        System.out.println("Interface Main Method");
    }

    /*
    deafult static void defaultstatic(){
        //We can't declare both together
    }
    */
}
/*
Generally Utility methods are declared as static method. These methods can be called just by Interface name
Interface Static method by default not available to child class.

From 1.8v, we can declare main method in interface and can run interface directly from command prompt.

Deafult keyword is mandatory for default methods, whereas for static method,
public is optional and by default it is always public.

Method with default keyword is allowed only in interface but not in class.
 */