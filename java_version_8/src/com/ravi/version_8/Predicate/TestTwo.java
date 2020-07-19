package com.ravi.version_8.Predicate;

import java.util.function.Predicate;

public class TestTwo {
    public static void main(String[] args){
        Predicate<String> p= S->S.length()>5;
        System.out.println(p.test("ravi"));
        System.out.println(p.test("Bhawana"));
    }
}
