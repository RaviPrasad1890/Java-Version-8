package com.ravi.DefaultMethodInsideInterafce;

public interface Right {
    default void m1(){
        System.out.println("Right default method");
    }
}
