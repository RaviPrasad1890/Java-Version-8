package com.ravi.version_8.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/*
* Remove null and empty values from list
* */
public class TestFive {
    public static void main(String[] args){
        Predicate<String> p= s->(s!=null)&&(s.length()!=0);
        List<String> list=new ArrayList<>();
        List<String> modifiedList=new ArrayList<>();
        list.add("a");
        list.add("");
        list.add("c");
        list.add(null);

        System.out.println("List "+list);
        for (String s:list
             ) {
            if(p.test(s)){
                modifiedList.add(s);
            }
        }
        System.out.println("List "+modifiedList);
    }
}
