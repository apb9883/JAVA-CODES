import java.util.Scanner;

class Fact{
    public int factorial(int n) {
        int facto = 1;
        int i = 1;
        while (i <= n) {
            facto = facto * i;
            i++;
        }
        return facto;
    }
}

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number ");
        int n= sc.nextInt();
        Fact f =new Fact();
        int a=f.factorial(n);
        System.out.println("Factorial upto n is " +a);
    }
}
