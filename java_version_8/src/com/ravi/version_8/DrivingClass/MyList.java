package com.ravi.version_8.DrivingClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyList {
    public static void main(String[] args){
        List<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(3);
        al.add(55);
        al.add(-21);
        al.add(9);
        al.add(10);
        al.add(5);
        al.add(1);
        al.add(81);
        al.add(60);
        al.add(1);

//        Comparator<Integer> c=(Integer o1, Integer o2)->{
//            return(o1>o2)?-1:(o1<o2)?1:0;
//        };
        Comparator<Integer> c=(o1,o2)->(o1>o2)?-1:(o1<o2)?1:0;

        System.out.println("Before sorting ArrayList: "+al);
        Collections.sort(al,c);
        //We can pass comparator object directly
        //Collections.sort(al,(o1,o2)->(o1>o2)?-1:(o1<o2)?1:0);
        System.out.println("After sorting ArrayList: "+al);
    }
}
