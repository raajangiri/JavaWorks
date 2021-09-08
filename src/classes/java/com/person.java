
package classes.java.com;
// all values update by paramater constructor 
// individual value update -setter 
// all vaues get-toString
// individual values get - getter 4
// defeault constructor -


public class person {
    int id;
    String name;
    String address;
    
    // defeault constructor
    public  person()
    {
    this.id=1;
    this.name="";
    this.address="";
    }
    // method overloading 
    // paramarerixes constructor 
   public person(int id,String name, String address)
    {
    this.id=id;
    this.name=name;
    this.address=address;
    }
   // copy constructor 
   public person (person p)
   {
   this.id=p.id;
   this.name=p.name;
   this.address=p.address;
   }
   // setter 
   public void setId(int id)
   {
   this.id=id;
   }
   public void setName(String name)
   {
   this.name=name;
   }
   public void setAddress(String address)
   {
   this.address=address;
   }
    public String toString()
    {
    return(this.id+"  "+this.name+" "+this.address);
            
    }
    // getter 
    public int getId()
    {
    return(this.id);
    }
     public String getName()
    {
    return(this.name);
    }
      public String getAddress()
    {
    return(this.address.toUpperCase());
    }
    
   
}
