import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter yur name: ");
        String name=sc.nextLine();
        System.out.println("Hello "+name);
        System.out.print("Please enter your age: ");
        int age=sc.nextInt();
        System.out.println("Your age is "+age);
    }
}
