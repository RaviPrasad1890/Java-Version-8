package com.ravi.version_8.DrivingClass;



import java.util.Comparator;
import java.util.TreeSet;

public class MyTreeSet {
    public static void main(String[] args){
        /*
        Comparator<Integer> c=(i1, i2)->(i1>i2)?-1:(i1<i2)?1:0;
        TreeSet<Integer> tSetOne=new TreeSet<>(c);
        */

        //Directly passing Comparator Object
        TreeSet<Integer> tSetOne=new TreeSet<>((i1,i2)->(i1>i2)?-1:(i1<i2)?1:0);
        tSetOne.add(10);
        tSetOne.add(60);
        tSetOne.add(81);
        tSetOne.add(18);
        tSetOne.add(90);
        tSetOne.add(85);
        tSetOne.add(38);

        System.out.println("TreeSet: "+tSetOne);
    }
}
