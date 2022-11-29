import java.util.Scanner;

class myclass{
    void quotient(int a,int b) throws ArithmeticException{
        try {
            if(a == 0)
                throw new Exception("the quotient cannot be zero"); 
            int quotient = a/b;
        } catch (ArithmeticException e) {
            System.out.println("dividing by zero is not allowed");
        }
        finally{
            System.out.println("You are going to exit from the function");
        }
    }
}
public class excep {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        myclass myvar = new myclass();
        myvar.quotient(a, b);
    }
}