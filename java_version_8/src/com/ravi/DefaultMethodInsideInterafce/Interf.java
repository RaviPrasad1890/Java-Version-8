package com.ravi.DefaultMethodInsideInterafce;

/*
From Java Version 8, we are allowed to declare default method inside interface using default keyword
 */
public interface Interf {
    default void defaultMethodOfInterf(){
        System.out.println("Default Method Inside Interface");
    }
}
