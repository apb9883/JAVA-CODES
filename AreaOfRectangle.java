import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the height of triangle ");
        int a = sc.nextInt();
        System.out.println("Enter the base of triangle ");
        int b = sc.nextInt();
        float c = (a*b*1)/2;
        System.out.println("The area of triangle will be "+c);
    }
}
