package com.ravi.oldways.DrivingClass;

import com.ravi.oldways.Impl.MyComparator;

import java.util.TreeSet;

public class MyTreeSet {
    public static void main(String[] args){
        //If we want to sort a Set in natural sorting order, than we should go for TreeSet
        //TreeSet<Integer> tSetOne=new TreeSet<Integer>();//Made for natural sorting order,i.e.,Ascending order
        //If we want a customized sorting order, than we should pass Comparator object
        TreeSet<Integer> tSetOne=new TreeSet<>(new MyComparator());
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
