package fileio;

import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class NIOReadWrite {

    final Path FILE = Paths.get("E:\\Documents\\aa.txt");

    public void write(String str) throws IOException {
        Files.write(FILE, str.getBytes(), StandardOpenOption.APPEND);
    }

    public String read() throws IOException {
        String str = "";
        List<String> list = Files.readAllLines(FILE);
        for (int i = 0; i < list.size(); i++) {
            str += list.get(i);
        }
        return(str);

    }

    public NIOReadWrite() throws IOException {
        String str = "NIO Testing";
        write(str);
        str = read();
        System.out.println(str);

    }

    public static void main(String args[]) throws IOException {
        new NIOReadWrite();
    }

}
