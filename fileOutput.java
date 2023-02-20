// import java.util.*;
// import java.io.*;
// public class fileOutput{
//     public static void main(String [] args){
//         try{
//             File f = new File("mynewsample.txt");
//             if(f.createNewFile())
//                 System.out.println("new file created");
//             else
//                 System.out.println("the file already exist");
                
//             // FileOutputStream fos =  new FileOutputStream(f);
            
//             // String str = "hello there testing the new file output stream";
//             // byte[]  bytestr = str.getBytes();
//             // fos.write(bytestr);
//             // fos.close();

//             FileReader fis =  new FileReader(f);
//             char []chararray = new char[100];
//             int offset=5,len=10;
//             fis.read(chararray,offset,len);
//             System.out.println(offset+" "+len);
//             System.out.println(chararray); 
    
//         } catch(IOException e){
//             System.out.println(e);
//         }
//     }
// }
import java.io.*;

class FileCopy {
    public static void main(String[] args) {
        // Define the source and destination file paths
        String sourceFile = "file.txt";
        String destFile = "file2.txt";

        try {
            // Create a FileInputStream to read from the source file
            FileInputStream fis = new FileInputStream(sourceFile);

            // Create a FileOutputStream to write to the destination file
            FileOutputStream fos = new FileOutputStream(destFile);

            // Allocate a buffer to read data from the source file
            byte[] buffer = new byte[1024];

            int read;
            // Read data from the source file and write it to the destination file
            while ((read = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, read);
            }

            // Close the streams
            fis.close();
            fos.close();

            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file.");
            e.printStackTrace();
        }
    }
}
