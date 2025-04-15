import java.util.Scanner;

public class SumOfOddUptoN {

    public static int sumOfOdd(int n) {
        int sum=0;
        int i=1;
        while(i<=n){
                sum=sum+i;
                i=i+2;
            }
            return sum;
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        int sum=sumOfOdd(n);
        System.out.println("Sum upto "+n +" is " +sum);
    }
}
