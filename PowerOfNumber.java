import java.util.Scanner;

class PowerNumber{
    public int power(int a, int b){
        int i=1;
        int result=1;
        while(i<=b){
            result=result*a;
            i++;
        }
        return result;
    }
}

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int a=sc.nextInt();
        System.out.println("Enter the power ");
        int b= sc.nextInt();
        PowerNumber pn=new PowerNumber();
        int c=pn.power(a, b);
        System.out.println("After calculation the result will be " +c);
    }
}
