// // print the line number and the line from a file
//the following pgm shows 3 ways to display the linenumbers and the line from a file s

// import java.io.*;
// import java.util.*;
// public class linenumber {
//     public static void main(String[] args) throws IOException {
//         File file = new File("C:\\Users\\user\\Desktop\\java\\java\\src\\java\\linenumber.java");
//         Scanner sc = new Scanner(file);
//         int i = 1;
//         while (sc.hasNextLine()) {
//             System.out.println(i + " " + sc.nextLine());
//             i++;
//         }
//         sc.close();
//     }
// }

// //line number and line from a file using just filereader
// import java.io.*;
// import java.util.*;
// public class linenumber {
//     public static void main(String[] args) throws IOException {
//         FileReader fr = new FileReader("C:\\Users\\user\\Desktop\\java\\java\\src\\java\\linenumber.java");
//         BufferedReader br = new BufferedReader(fr);
//         String line;
//         int i = 1;
//         while ((line = br.readLine()) != null) {
//             System.out.println(i + " " + line);
//             i++;
//         }
//         br.close();
//     }
// }

// //line number and line from a file using just filereader no bufferredreader
import java.io.*;
import java.util.*;
public class linenumber {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("hello.txt");
        int i = 1;
        int c;
        System.out.print(i + " ");
        i++;
        while ((c = fr.read()) != -1) {
            System.out.print((char)c);
            if ((char)c == '\n') {
                System.out.print(i + " ");
                i++;
            }
        }
        fr.close();
    }
}
