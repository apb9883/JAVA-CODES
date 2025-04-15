import java.util.Scanner;

public class MultiplicationTable {

    public static void tableOfMultiplication(int num) {
        int i=1;
        while(i<=10){
            System.out.println(num +" X " +i + " = " + (num*i));
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of multiplication ");
        int num= sc.nextInt();
        tableOfMultiplication(num);
    }
}
