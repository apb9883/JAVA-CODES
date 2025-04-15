import java.util.Scanner;

public class PerimeterOfClass {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of rectangle ");
        int a = sc.nextInt();
        System.out.println("Enter breadth of rectangle ");
        int b = sc.nextInt();
        int c = 2*(a+b);
        System.out.println("The perimeter of rectangle will be " +c);
    }
}
