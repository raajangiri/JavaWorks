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
public class Marks {
    int S_id;
    int mark1;
     int mark2;
     
     
      public Marks()
      {
        this.S_id=5;
        this.mark1=50;
        this.mark2=60;
      }
      
      public Marks(int S_id,int mark1, int mark2)
      {
      this.S_id=S_id;
      this.mark1=mark1;
      this.mark2=mark2;
      }
      
      // public 
      public String toString()
      {
        return (this.S_id+"   "+this.mark1+"   "+this.mark2);
      }
    
}
