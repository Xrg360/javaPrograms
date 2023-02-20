//this pgm shows how to throw a custom exception in java

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

class myException extends Exception {
    myException() {
        System.out.println("this number is not possible...");
    }
}

class Main {
    public static void main(String[] args) {
        File f = new File("dest.txt");
        try {
            FileReader fr = new FileReader(f);
            int i;
            try {
                while ((i = fr.read()) != -1) {
                    if (i-'0' == 5) {
                        throw new myException();
                    }
                }
            } catch (myException ae) {
                System.out.println(ae);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}