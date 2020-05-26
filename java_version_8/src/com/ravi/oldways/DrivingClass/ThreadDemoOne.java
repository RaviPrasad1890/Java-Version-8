package com.ravi.oldways.DrivingClass;

import com.ravi.oldways.Impl.MyRunnable;

public class ThreadDemoOne {
    public static void main(String[] args){
        Runnable r=new MyRunnable();
        Thread t= new Thread(r);
        t.start();
        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
        }
    }
}
