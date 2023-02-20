//this pgm lets the user to print the linenumber and the lines using bufferedreader

import java.util.*;
import java.io.*;

public class displayLIne {
    public static void main(String[] args) {
        try{
            File f = new File("dest.txt");
            BufferedReader br = new BufferedReader(new FileReader(f));
            int line=1;
            String str;
            while((str = br.readLine())!=null){
                System.out.println(line + " "+ str);
                line++;
            }
            System.out.println(line);
        } catch(IOException e){
            System.out.println(e);
        }
    }
}
