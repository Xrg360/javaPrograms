//this pgm lets the user to enter the numbers as 1,2,3,4,5 and finds the sum

import java.util.StringTokenizer;
import java.util.Scanner;

public class stringTokenizer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the numbers as 1,2,3,4,5");
        String num = scan.next();
        StringTokenizer st = new StringTokenizer(num,",");
        int sum =0;
        while(st.hasMoreTokens()){
            // sum += Integer.parseInt(st.nextToken());
            String s =st.nextToken();
            int n = Integer.parseInt(s);
        }
        System.out.println("sum : "+sum);
        scan.close();
    }
}
