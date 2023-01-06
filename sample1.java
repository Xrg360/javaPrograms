import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.WildcardType;
import java.nio.channels.Pipe.SinkChannel;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class sample1 {
    public static void main(String[] args) {
        // FileInputStream fis = new FileInputStream("hello.txt");
        try {
            // File f=  new File("hello.txt");
            // FileReader fr =  new FileReader(f);
            // int s;
            // File f1 = new File("hello2.txt");
            // FileWriter fw = new FileWriter(f1);
            // while ((s=fr.read())!=-1) {
            //     fw.write((char)s);
            //     fw.flush();                
            // }
            int i=0,ia;
            // File f= new File("hello.txt");
            String a = "this is the done by honourable outputstream";
            // FileOutputStream foss = new FileOutputStream(f);
            // BufferedOutputStream boss = new BufferedOutputStream(foss);
            BufferedOutputStream boss = new BufferedOutputStream(new FileOutputStream(new File("hello.txt")));
            while (a.charAt(i)!='m') {
                ia=(int)a.charAt(i);
                boss.write(ia);
                i++;
            }
            InputStreamReader isr = new InputStreamReader(null)
            boss.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    
}
}
