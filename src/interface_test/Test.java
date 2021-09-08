/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_test;

/**
 *
 * @author IAmNotIntrovert
 */
public class Test implements Inf1, Inf2 {
       @Override
    public void f1() {
        System.out.println("hello frn inf1  ");
    }

    @Override
    public void f2() {
        System.out.println("hello from inf2 ");
    }

    public static void main(String args[]) {

        System.out.println(Inf1.MAX);
        System.out.println(Inf2.MAX);
        new Test().f1();
        new Test().f2(); 
         Test t1=new Test();
         t1.f1();
         t1.f2();
        // making object of interface 
        
         Inf1 obj1;
         Inf2 obj2;
         obj1=new Test1();
         obj2=new Test1();
         obj1.f1();
         obj2.f2();
        
         

    }

 
}
