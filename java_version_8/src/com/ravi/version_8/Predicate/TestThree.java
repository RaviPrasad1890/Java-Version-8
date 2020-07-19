package com.ravi.version_8.Predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/*
* WAP to check if given collection object is empty or not, using predicate
* */
public class TestThree {
    public static void main(String[] args){
        Predicate<Collection> p=c->c.isEmpty();

        List<String> listOne= new ArrayList<>();
        List<String> listTwo= new ArrayList<>();
        listOne.add("a");
        listOne.add("b");

        System.out.println(p.test(listOne));
        System.out.println(p.test(listTwo));
    }
}
