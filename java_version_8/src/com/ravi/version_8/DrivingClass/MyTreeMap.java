package com.ravi.version_8.DrivingClass;

import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String[] args){
        TreeMap<Integer,String> t=new TreeMap<>((i1,i2)->(i1>i2)?-1:(i1<i2)?1:0);
        t.put(2,"Kumar");
        t.put(3,"Ravi");
        t.put(1,"Prasad");
        System.out.println("Map : "+t);
    }
}
