import java.util.Scanner;

public class FahrenheitToCelcius {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the farhenheit ");
        int a = sc.nextInt();
        int b = (a-32)*5/9;
        System.out.println("The celcius scale will be "+b);
    }
}
