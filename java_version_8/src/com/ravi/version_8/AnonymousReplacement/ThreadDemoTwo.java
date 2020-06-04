package com.ravi.version_8.AnonymousReplacement;

//Repalcing Annonymous way of Implementing Thread
public class ThreadDemoTwo {
    public static void main(String[] args){
        Runnable r=()->{
            for(int i=0;i<10;i++){
                System.out.println("Child Thread");
            }
        };

        Thread t= new Thread(r);
        t.start();

        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
        }
    }
}
