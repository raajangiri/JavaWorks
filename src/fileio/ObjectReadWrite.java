
package fileio;
import jdbc.Person;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;





public class ObjectReadWrite {
    final String FILE = "E:\\Documents\\object.txt";
    
    
    public void write(Person p) throws FileNotFoundException,IOException{
    FileOutputStream f=new FileOutputStream(new File(FILE));
    ObjectOutputStream o=new ObjectOutputStream(f);
    o.writeObject(p);
    o.close();
    f.close();
    
    }
    public Person read() throws FileNotFoundException,IOException,ClassNotFoundException
    {
    FileInputStream fi=new FileInputStream(new File(FILE));
     ObjectInputStream  oi=new ObjectInputStream (fi);
     Person pi=(Person) oi.readObject();
     return pi;
    
    }
    
    public ObjectReadWrite () throws  FileNotFoundException,IOException,ClassNotFoundException
    {
    Person p=new Person(1,"name","address");
    write (p);
    p=read();
        System.out.println(p);
    }
    
    public static void main(String args [])throws  FileNotFoundException,IOException,ClassNotFoundException
    {
    new ObjectReadWrite();
    }
    
}
