
package classes.java.com;

public class MyFunctions {
    public static void printHello()
    {
    System.out.println("hello word of java");
    }
    public static void printMessage(String msg)
    {
    System.out.println(msg);
    
    }
    public static int getNumber()
    {
    int n=0;
    n=(int)Math.random()*10;
    return(n);
    }
    public static int doAdd(int n1,int n2)
    {
    int n3=n1+n2;
    return(n3);
    }
     

}
