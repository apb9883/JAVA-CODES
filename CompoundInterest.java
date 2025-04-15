import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Principle ");
        int a = sc.nextInt();
        System.out.println("Enter the rate ");
        float b = sc.nextFloat();
        System.out.println("Enter time ");
        float c = sc.nextFloat();
        double d = a*Math.pow((1+b/100),c);
        System.out.println("After calculating the interest rate will be "+d);
    }
}
