package com.ravi.oldways.DrivingClass;

import com.ravi.oldways.Impl.MyComparator;

import java.util.ArrayList;
import java.util.Collections;
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
        System.out.println("Before sorting ArrayList: "+al);
        //Collections.sort(al);//For default Sorting Order,i.e. Ascending Order
        Collections.sort(al,new MyComparator());//MyComparator object was created to sort in Descending order
        System.out.println("After sorting Arraylist: "+al);
        //Note: Collections.sort method takes list as an argument

    }
}
