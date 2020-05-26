package com.ravi.oldways.DrivingClass;

import com.ravi.oldways.Impl.DemoTwo;
import com.ravi.oldways.Interf.InterfaceTwo;

public class MainTwo {

    public static void main(String[] args){
        InterfaceTwo i = new DemoTwo();
        int res=i.add(10,20);
        System.out.println(res);
    }
}

