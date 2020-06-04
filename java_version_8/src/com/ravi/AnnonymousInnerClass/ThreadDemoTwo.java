package com.ravi.AnnonymousInnerClass;

public class ThreadDemoTwo {
    //Wherever Annonymous Inner class is implemented, we can , some of the time, replace it with
    //Lambda Expression
    /*
    We can replace anonymous inner class with lambda exp iff Interface contains only one abstract method
     */

    public static void main(String[] args){
        Runnable r = new Runnable (){
            public void run() {
                for(int i=0;i<10;i++){
                    System.out.println("Child Thread");
                }
            }
        };

        Thread t=new Thread(r);
        t.start();
        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
        }
    }
}
