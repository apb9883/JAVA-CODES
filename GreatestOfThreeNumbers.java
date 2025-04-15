import java.util.Scanner;

public class GreatestOfThreeNumbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number ");
        int a= sc.nextInt();
        System.out.println("Enter second number ");
        int b= sc.nextInt();
        System.out.println("Enter third number ");
        int c= sc.nextByte();
        if(a>b && a>c){
            System.out.println("First number is greater ");
        }
        else if(b>c){
            System.out.println("Second number is greater");
        }
        else{
            System.out.println("Third number is greater");
        }
    }
}
