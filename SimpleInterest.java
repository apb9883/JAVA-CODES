import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Principle ");
        int a = sc.nextInt();
        System.out.println("Enter the rate ");
        int b = sc.nextInt();
        System.out.println("Enter time ");
        int c  = sc.nextInt();
        int d = (a*b*c)/100;
        System.out.println("After calculating the interest rate will be "+d);
    }
}
