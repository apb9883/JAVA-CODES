import java.util.Scanner;

class Sum{
    public int add(int n) {
      int sum=0;
      while(n!=0){
          sum=sum+n%10;
          n=n/10;
      }
      return sum;
    }
}

public class SumOfDigitsOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n= sc.nextInt();
        Sum s=new Sum();
        int b=s.add(n);
        System.out.println("The sum of digits of number is " +b);
    }
}
