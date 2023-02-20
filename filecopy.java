import java.io.*;
public class filecopy {
    public static void main(String[] args) {
        File f = new File("firstfile.txt");
        File f2 = new File("secondfile.txt");
        try {
            FileInputStream fis = new FileInputStream(f);
            FileOutputStream fos = new FileOutputStream(f2);
            int c;
            while ((c = fis.read()) != -1) {
                fos.write(c);
            }
            fis.close();
            fos.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
