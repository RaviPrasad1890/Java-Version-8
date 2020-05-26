package com.ravi.version_8.DrivingClass;

import com.ravi.version_8.Interf.InterfaceTwo;

public class MainTwo {

    public static void main(String[] args){
        /*
        //Full descriptive version
        InterfaceTwo i=(int a, int b)->{
            return (a+b);
        };
        */

        //Simplified Version
        InterfaceTwo i=(a, b)->a+b;

        int res=i.add(10,20);
        System.out.println(res);
    }
}
