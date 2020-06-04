package com.ravi.version_8.AnonymousReplacement;
/*
If we are using local var inside lambda expression, then immediately it becomes final,
if we are not using then it remains as it is.
It means, if we are using local variable inside lambda expression, we can't change its value in
lambda expression or anywhere outside lambda expression.
 */
public class TestTwo {
    int x=10;
    public void m2(){
        int y=20;
        InterfA i=()->{
            System.out.println(x);//10
            System.out.println(y);//20
            x=888;
            //y=999;//CE: Local Var ref frmo lambda expresiion must be final or effective final
        };
        i.m1();
        //y=999;//We can change variable y here, but before that we need to comment usage of it inside
                //lambda expression,i.e., System.out.println(y) needs to be commented inside lambda expression
    }
    public static void main(String[] args){
        Test t= new Test();
        t.m2();
    }
}
