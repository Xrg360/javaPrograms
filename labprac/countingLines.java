//this pgm lets the user to print the number of line to the console form a file

import java.io.*;

public class countingLines {
    public static void main(String[] args) {
        File f = new File("dest.txt");
        try{
            BufferedReader br = new BufferedReader(new FileReader(f));
            int line=0;
            String str;
            while((str = br.readLine())!=null){
                line++;
            }
            System.out.println(line);
            br.close();
        } catch(IOException e){
            System.out.println(e);
        }
    }
}
