import java.util.Scanner;

public class smallestele {
    public static void main(String[] args) {
        int arr[] = new int[10];
        System.out.println("enter the size of array : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("enter the array : ");
        for (int i = 0; i < n; i++) {
            System.out.println("enter a["+i+"] : ");
            arr[i]= scan.nextInt();
        }
        int smallest = arr[0];
        for (int i = 1; i < n; i++) {
            if(arr[i]<smallest)
                smallest =arr[i];
        }
        System.out.println("smallest element : "+smallest);
    }
}