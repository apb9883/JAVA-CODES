import java.util.Scanner;

public class FactorialOfNumber {

    public static long factorial(int num) {
         if(num<2){
             return 1;
         }
        int n=2;
        long fact=1;
         while(n<=num){
            fact=fact*n;
             n++;
         }
         return fact;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        long fact = factorial(n);
        System.out.println("The factorial of " +n+ " is " +fact);
    }
}
