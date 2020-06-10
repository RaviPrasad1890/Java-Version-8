package com.ravi.StaticMethodInsideInterface;

public class Test1 implements Interf{
    public static void staticMethodOfInterf(){
        //Valid but not method overriding
    }
    /*
    Ovveriding concept not applicable for Interface static method because Interface static metjdo is not
    available to child class.
    If we want we can declare exactly same method in our child class but its not method overriding.

     */
}
