import java.util.Scanner;

interface myinterface {
    void display(int x);
    void sum(int x,int y);
    void diff(int x,int y);
    void read();
}

public class interfaces implements myinterface {
    public void display(int x){
        System.out.println("number is "+x);
    }
    public void sum(int x,int y){
        display((x+y));
    }
    public void diff(int x,int y){
        display((x-y));
    }
    public void read(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number : ");
        int x= scanner.nextInt();
        System.out.println("enter the number : ");
        int y= scanner.nextInt();
        sum(x, y);
        diff(x, y);
        scanner.close();
    }
    public static void main(String[] args) {
        myinterface obj = new interfaces();
        obj.read();
    }
}
