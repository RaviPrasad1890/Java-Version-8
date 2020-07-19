package com.ravi.version_8.Predicate;

import java.util.function.Predicate;

/*
* WAP to test if name starts with k
* */
public class TestFour {
    public static void main(String[] args){
        String[] names={"Rani","Kajol","Bhumi","Katrina","kangna"};

        Predicate<String> p=s->s.charAt(0)=='K'||s.charAt(0)=='k';
        for (String x1:names
             ) {
            if(p.test(x1)){
                System.out.println(x1);
            }
        }
    }
}
