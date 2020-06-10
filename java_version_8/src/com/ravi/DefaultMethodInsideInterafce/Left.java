package com.ravi.DefaultMethodInsideInterafce;

public interface Left {
    default void m1(){
        System.out.println("Left Default Method");
    }
}
