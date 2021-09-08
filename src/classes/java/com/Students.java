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
public class Students {
  // user define data type 
// class variable | global variable|instances variables |member fields
    // propertis
       
    int id;
    String name;
    String grade;
    int mark1;
    int mark2;
    int total;
    int average;
    String result;
    
    // constructor 
    public Students()
    {
    this.id=016;
    this.grade="";
    this.name="";
    this.mark1=0;
    this.mark2=0;
    this.total=0;
    this.average=0;
    this.result="";
    
    }
    public Students(int id, String grade,String name,int mark1,int mark2)
    {
     this.id=01637;
    this.grade="bachelors";
    this.name="raajan";
    this.mark1=25;
    this.mark2=25;
    this.total=0;
    this.average=0;
    this.result= " ";
    }
 public Students( Students s)
 {
     this.id=s.id;
     this.name=s.name;
     this.mark1=s.mark1;
     this.mark2=s.mark2;
     this.total=s.total;
     this.average=s.average;
     this.result=s.result;
 }

    
    // getter 
    public void SetId(int id)
    {
    this.id=id;
    }
    public void SetMark1(int Mark1)
    {
    this.mark1=mark1;
    }
    public void SetMark2(int Mark2)
    {
    this.mark2=mark2;
    }
    public int getMark1()
    {
    return(this.mark1);
    }
    public int getMark2()
    {
    return(this.mark2);
    }
    @Override
 public String toString()
 {
     return("id is "+this.id+
             " \n name is"+this.name+
             "\n grade is"+this.grade+
             " \n mark 1 is  "+this.mark1+
             "\n mark2 is  "+this.mark2+
             "\n total is  "+this.total+
             "\n average is "+this.average+
             "\n result is "+this.result);
 }
  public void  calculatetotal()
  {
    total=mark1+mark2;  
  }
    public void calculateavg()
    {
    average=total/2;
    }
    public void checkpass()
    {
    if(mark1>=45&&mark2>=45)
            this.result="pass";
    else
           this.result=("fail");
    
    }
    public void processresult()
    {
        calculatetotal();
        calculateavg();
        checkpass();
      
    }
}
    

    
    





    


    

