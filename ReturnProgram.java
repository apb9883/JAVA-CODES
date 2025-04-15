import java.util.Scanner;

public class ReturnProgram {

    public static void greet() {
        System.out.println("Hello this is the program of return statement without arguments or parameter.");
    }

    public static int readNumbers() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number=");
        /* Here we can also write
        int a=sc.nextInt();
        return a;
        above statement is also true but it will take extra memory.
         */
        return sc.nextInt();
    }

    public static void main(String[] args) {
         greet();
         int a=readNumbers();
         int b=readNumbers();

         int sum= a + b;
        System.out.println("After adding two numbers the result will be "+sum);
    }
}
