package com.ravi.StaticMethodInsideInterface;

public class InterfImpl implements Interf{
    public static void main(String[] args){
        InterfImpl obj= new InterfImpl();
       // obj.m1();//CE
        //InterfImpl.m1();//CE
        Interf.staticMethodOfInterf();
    }
}
