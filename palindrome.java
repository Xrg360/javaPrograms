import java.util.Scanner;

// this pgm checks the number palindrome
public class palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        int flag=0;
        char[] a= word.toCharArray();
        for(int i=0,j=word.length()-1;i<j;i++,j--){
            if (a[i]!=a[j]) {
                flag=1;  
                break;              
            }
        }
        if (flag==0) {
            System.out.println("word is palindrome");
        } else {
            System.out.println("not a palindrome");
        }
        
    }
}
