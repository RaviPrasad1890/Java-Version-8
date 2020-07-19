package com.ravi.version_8.Predicate;

import java.util.function.Predicate;

/*
* Predicate: Predefined Functional Interface
* Present in java.util.function package
* test():-Only one abstarct method present in it which return boolean
*
* interafce Predicate<T>{
* boolean test(T t);
* }
* Predicate interace contains only one abstarct method that returns boolean after doing some check
*
* */
public class TestOne {
    public static void main(String[] args){
        Predicate<Integer> p=I->I>10;

        System.out.println(p.test(100));
        System.out.println(p.test(5));
    }
}
/*
* More Info:
* Predicate conatins multiple default method
* p1.negate()=>Opposite of p1
* p1.and(p2)=>Predicate Joining
* p1.or(p2)=>Any one predicate
* */