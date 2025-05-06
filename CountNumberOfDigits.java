import java.util.Scanner;

class CountNumbers{
public int numbers(int n){
    int count=0;
    while(n!=0){
        n=n/10;
        count++;
    }
    return count;
}
}

public class CountNumberOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number");
        int n= sc.nextInt();

        CountNumbers cn=new CountNumbers();
        int a=cn.numbers(n);
        System.out.println("The number of digits in the number is " +a);
    }
}
