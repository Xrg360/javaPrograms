import java.util.Scanner;
import java.util.StringTokenizer;

public class stringtokenizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string  : ");
        String s = scanner.nextLine();
        StringTokenizer st = new StringTokenizer(s);
        System.out.println("the input numbers are : ");
        int sum = 0;
        while (st.hasMoreTokens()) {
            String c = st.nextToken();
            System.out.println(c);
            sum+=Integer.parseInt(c);
        }
        System.out.println("sum = "+sum);
        scanner.close();
    }
}
