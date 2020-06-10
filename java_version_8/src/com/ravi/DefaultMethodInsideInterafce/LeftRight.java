package com.ravi.DefaultMethodInsideInterafce;

public class LeftRight implements Left,Right{

    /*
    CE: Class LeftRight inherihts unrelates defaults for m1 from types left and right
     */

   // Solution 1:We need to ovveride m1 method in LeftRight
   /*
   @Override
   public void m1() {
       System.out.println("My Own Implementation");
   }
   */
   //Solution 2: If we need Interface implementation by any reason, than
   @Override
   public void m1() {
       Left.super.m1();
       Right.super.m1();
   }

   /*
   Note:
   Inside Interafce every var is always public, static, and final. We can't declare instance var.
   Inside Abstarct class we can declare instance variable, which are required to the child class.

   Inside Interace we can't declare static block or instance block.
   Inside Abstract class we can declare static or Instance block.
    */
}
