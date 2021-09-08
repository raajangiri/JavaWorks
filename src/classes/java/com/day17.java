/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.java.com;

/**
 *
 * @author IAmNotIntrovert
 */
public class day17 {
    public static void main(String args[])
    {
   /* person p;
    person p1;//  p1 aagadi initilize na garda hunxa 
    
    p =new person();//class person  initixation and decleration
    p.name="Raajan";
    p.address="bhakatapur";
    p.id=375;
    System.out.println(p.id+"  "+p.name+"  "+p.address);
    p1=p;//pointer jstai ho 
    System.out.println(p1.id+"  "+p1.name+"  "+p1.address);
    p1.id=2;
    p1.name="hacker";
    p1.address="banasthaili";
    System.out.println(p.id+"  "+p.name+" "+p.address);
    p1=new person();// p1 pani initilize vayo . ava link hudina p1 ra p ko 
    p1.id=5;
    p1.address="koteshwor";
    p1.name="hacker back";
    System.out.println(p1.id+"  "+p1.name+"  "+p1.address);

        //part of class bhitra ko person 
        person p1=new person();// defeault value initilization 
        person p2=new person();// defeault value initilization 
        person p3=new person(1,"ram","neapl");
        System.out.println(p1.id+"  "+p1.name+" "+p1.address);
        System.out.println(p1.id+"  "+p1.name+" "+p1.address);// gives same value as p1
        p1.id=2;
        p1.address="bhaktapur";
        p1.name="dipesh";
        System.out.println(p1.id+"  "+p1.name+" "+p1.address);
        p2.id=25454;
        p2.address="bhaktapurjbdfvbdjd";
        p2.name="dipeshgfjhdbf";
        System.out.println(p2.id+"  "+p2.name+" "+p2.address);
        // to print the valie of p3
        System.out.println(p3.id+"  "+p3.name+" "+p3.address);
*/
        
        // from the class marks 
        Marks m=new Marks();
        Marks m1=new Marks(50,50,50);
        Marks m2;
        // using defeault constructor 
        m.S_id=50;
        m.mark1=500;
        m.mark2=600;
        System.out.println(m.S_id+"  "+m.mark1+" "+m.mark2);
        // output for parematerizrd constructor 
        System.out.println(m1.S_id+"  "+m1.mark1+" "+m1.mark2);
        m1.S_id=5;
        m1.mark1=2500;
        m1.mark2=5600;
        System.out.println(m1.S_id+"  "+m1.mark1+" "+m1.mark2);
        // direct printing 
        System.out.println(m1);
        System.out.println(m);
        m2=m1;
        System.out.println("the out put of m2 is");
        System.out.println(m2);
        m2.S_id=50;
        m2.mark1=200;
        m2.mark2=400;
        m1=new Marks();
        System.out.println(" th eupdated value of m1 is ");
        System.out.println(m1);
  
        
        
        
        
        
        
                
        
    
    }
    
}
