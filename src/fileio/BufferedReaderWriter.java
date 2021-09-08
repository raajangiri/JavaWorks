
package fileio;
import java.io.BufferedWriter;
import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class BufferedReaderWriter {
    final String FILE = "E:\\Documents\\ram.txt";
    
    public void write (String str) throws IOException{
    FileWriter fileWriter=new FileWriter(FILE);
    BufferedWriter bufferWriter=new BufferedWriter(fileWriter);
    bufferWriter.write(str);
    bufferWriter.close();
    fileWriter.close();
    
    }
    public String read () throws IOException
    {
    FileReader filereader=new FileReader(FILE);
     BufferedReader bufferReader=new BufferedReader(filereader);
     String line=bufferReader.readLine();
     String temp="";
     while (line!=null)
     {
     temp+=line;
     line=bufferReader.readLine();
     }
    bufferReader.close();
    filereader.close();
    
    return(temp);
    
    }
    
    public BufferedReaderWriter()throws IOException
    {
    String str="kathmandu";
    // write(str);
    str=read();
        System.out.println(str);
    }
    
    public static void main(String args [])throws IOException
    {
    new BufferedReaderWriter();
    }
}
