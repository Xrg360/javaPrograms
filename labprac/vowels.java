import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) {
        File f = new File("first.txt");
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the data to be written to the file : ");
        String str = scan.nextLine();
        try{
            FileWriter fw = new FileWriter(f);
            fw.write(str);
            fw.close();
            FileReader fr = new FileReader(f);
            int i;
            char c;
            String vow= "";
            while ((i= fr.read())!= -1) {
                System.out.println(c=(char)i);
                if(c == 'a'||c=='e'|| c=='i' || c=='o'|| c=='u'){
                    vow+=c;                    
                }
            }
            System.out.println(vow);
            File f2 = new File("second.txt");
            FileWriter fwr =  new FileWriter(f2); 
            fwr.write(vow);
            fwr.close();
        } catch(IOException e){
            System.out.println(e);
        }
            

    }
}