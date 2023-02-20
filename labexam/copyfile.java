import java.io.*;
import java.util.*;

public class copyfile {
    public static void main(String[] args) {
        try{
            FileReader reader = new FileReader("firstfile.txt");
            FileWriter writer = new FileWriter("file2.txt");
            // Read and write the contents of the source file to the destination file
            int c;
            while ((c = reader.read()) != -1) {
              writer.write(c);
            }
            // Close the reader and writer
            reader.close();
            writer.close();
        reader.close();
            writer.close();
            System.out.println("done copying..!");
        } catch(IOException e){
            System.out.println(e);
        }
    }
}
