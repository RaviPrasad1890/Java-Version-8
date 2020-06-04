package com.ravi.AnnonymousInnerClass;
/*
Inside Anonymous Inner class we can declare instance variable.
Inside Anonymous Inner class, this refers to current anonymous inner class instance variable.
 */
public class Test {
    int x=888;
    public void m2(){
        InterfA i=new InterfA(){
            //Anonymous Inner class
            int x=999;//Instance variable of anonymous inner class
            public void m1(){
                System.out.println(this.x);//999
                System.out.println(Test.this.x);//888
            }
        };
        i.m1();
    }
    public static void main(String[] args){
        Test t=new Test();
        t.m2();
    }
}
