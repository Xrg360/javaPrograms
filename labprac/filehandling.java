// this pgm lets the user to write somethign to the file source.txt and prints the written item to the console

import java.util.*;
import java.io.*;
public class filehandling {
    public static void main(String[] args) {
        try{
        File f = new File("source.txt");
        FileReader fr = new FileReader(f);
        int i;
        String readstr="";
        while((i=fr.read())!=-1){
            readstr += (char)i;
        }
        System.out.println(readstr);

        FileWriter fw = new FileWriter("dest.txt");
        fw.write(readstr);
        System.out.println("what you just wrote : ");
        fw.close();
        } catch(IOException e){
            System.out.println(e);
        }
    }
}
