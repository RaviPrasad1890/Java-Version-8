package com.ravi.version_8;

public class LambdaMethods {
    /*
    Dont have name
    Not having any modifier
    Not having any return type
     */

    public void m1(){
        System.out.printf("Heloo");
    }
    /*
    ()->{
        System.out.println("Heloo");
    }
    */
    public void add(int a,int b){
        System.out.println(a+b);
    }
    /*
    (int a, int b)->{
        System.out.println(a+b);
    }
    //Sometimes based on the context, Compiler can guess the type of variable automatically
    (a, b)->{
        System.out.println(a+b);
    }
    //If body contains only one statement, than curly braces are optional
    //However, We cant use return statement without {} braces
    (a, b)->System.out.println(a+b);

    */

    public int getLength(String s){
        return s.length();
    }
    /*
    (String s)->{
            return s.length();
        }

    (s)->{
            return s.length();
         }
      //Compiler can guess if we want to return something, so return can be omitted
    s->s.length();
     */
}
