import java.util.Scanner;

public class ReturnWithParameter {

    public static int addTwoNumbers(int first, int second) {
        System.out.println("Enter First Number " +first);
        System.out.println("Enter Second Number " +second);
        /*
        We can also write
        int sum = first+second;
        return sum;
         */
        return first+second;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int first=sc.nextInt();
        int second=sc.nextInt();
         int add=addTwoNumbers(first,second);
        System.out.println("After adding two numbers " +add);
         int add1=addTwoNumbers(45,72);
        System.out.println("After adding two numbers " +add1);
    }
}
