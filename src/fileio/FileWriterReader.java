package fileio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReader {

    final String FILE = "E:\\Documents\\data.txt";

    public void write(String str) throws IOException {
        FileWriter writer = new FileWriter(FILE);
        writer.write(str);
        writer.close();
    }

    public void read() throws IOException {
        FileReader reader = new FileReader(FILE);
        int n;
        while ((n = reader.read()) != -1) {
            System.out.print((char)n);
        }
        System.out.println("");
        reader.close();
    }
    
    public FileWriterReader() throws IOException
    {
    
        write("Hello");
        read();
        
    }
    public static void main(String args [])throws IOException
    {
    new FileWriterReader();
    }

}
