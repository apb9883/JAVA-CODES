import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("The value of a= ");
        int a=sc.nextInt();
        System.out.println("The value of b= ");
        int b=sc.nextInt();
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping the value of a will be "+a +" the value of b will be " +b);
    }
}