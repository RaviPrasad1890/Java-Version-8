package com.ravi.StaticMethodInsideInterface;

public interface Interf {
    public static void staticMethodOfInterf(){
        System.out.println("Interface Static Method");
    }
}
/*
Generally Utility methods are declared as static method. These methods can be called just by Interface name
Interface Static method by default not available to child class
 */