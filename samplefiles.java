import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

import javax.print.event.PrintEvent;
import javax.sound.midi.Soundbank;

public class samplefiles {
    public static void main(String args[]) {
        try {
            // System.out.println("enter the filename : ");
            // String filenanme = scanner.next();
            // filenanme = filenanme+".txt";
            // File f0 = new File(filenanme);
            // if (f0.createNewFile()) {
            // System.out.println("File " + f0.getName() + " is created successfully.");
            // } else {
            // System.out.println("File is already exist in the directory.");
            // }

            // READING THE FILE USING SCANNER

            // File f = new File("newsample.txt");
            // Scanner scanner = new Scanner(f);
            // while(scanner.hasNextLine()){
            // String filecontent = scanner.nextLine();
            // System.out.println(filecontent);
            // }
            // scanner.close();

            // USING FILEREADER CLASS

            // FileReader fr = new FileReader("newsample.txt");
            // or
            // File f = new File("newsample.txt");
            // FileReader fr = new FileReader(f);
            // int i;
            // i= fr.read();
            // while (i != -1) {
            // System.out.print((char)i);
            // i=fr.read();
            // }

            // BUFFERRED READER

            // File f = new File("newsample.txt");
            // FileReader fr = new FileReader(f);
            // BufferedReader br = new BufferedReader(fr);

            // // BufferedReader br = new BufferedReader(new FileReader(new
            // File("newsample.txt")));
            // String s;
            // int count=0;
            // while((s= br.readLine())!=null){
            // // System.out.println(s);
            // count++;
            // }
            // System.out.println(count);
            

            //WRITING USING FILEWRITER
            // File f = new File("newsample.txt");
            // FileWriter fw = new FileWriter(f);
            // Scanner scan = new Scanner(System.in);
            // System.out.println("enter the key : ");            
            // String s = scan.nextLine();
            // fw.write(s);
            // scan.close();
            // fw.close();

            //WRITING TO A FILE USING BUFFEREDWRITER
            // BufferedWriter bw = new BufferedWriter(new FileWriter("newsample.txt"));
            // Scanner scan = new Scanner(System.in);
            // System.out.println("enter the key : ");           
            // String c = scan.nextLine();
            // bw.write(c);


            //COPY_FROM_ONE_FILE_TO_OTHER
            File f1 = new File("sample1.txt");
            FileReader reader = new FileReader(f1);
            char c[] = new char[(int)f1.length()];
            reader.read(c);
            // for (int i = 0; i < c.length; i++) {
            //     System.out.println(c[i]);
            // }
            String s =new String(c);
            // System.out.println(s);
            File f2 = new File("sample2.txt");
            FileWriter fw = new FileWriter(f2);
            fw.write(s);
            fw.flush();
            fw.close();
            reader.close();



        } catch (IOException exception) {
            System.out.println("An unexpected error is occurred.");
            exception.printStackTrace();
        }
    }
}