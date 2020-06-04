package com.ravi.version_8.AnonymousReplacement;

public class Test {
    int x=888;
    public void m2(){
        InterfA i=()->{
            int x=999;//Local var of lambda expression amd not instance var
            System.out.println(this.x);//888
        };
        i.m1();
    }
    public static void main(String[] args){
        Test t = new Test();
        t.m2();
    }
}
