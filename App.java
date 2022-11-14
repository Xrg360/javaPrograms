// this is the program to find the frequency of a character in a string
import java.util.Scanner;
public class App {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("The frequency of " + ch + " is " + count);
    }
}
