import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("The value of a is ");
        int a = sc.nextInt();
        System.out.println("The value of b is ");
        int b = sc.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
    }
}
