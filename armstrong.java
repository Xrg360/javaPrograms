// this is the program to print all the 3 digit armstrong number
public class armstrong {

    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            chk_armstrong(i);
            
        }
    }
    // this method is defines static as it is called from a static method
    
    static void chk_armstrong(int i){
        int temp = i;
        int sum=0;
        while (temp>0) {
            int rem = temp%10;
            sum = sum+(rem*rem*rem);
            temp/=10;
        }
        if (sum==i) {
            System.out.println(i);
        }
    }
}