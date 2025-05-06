import java.util.Scanner;

class ReverseNumber{
    public int reversen(int n){
        int reverse=0;
        while(n!=0){
            int digit=n%10;
            reverse=reverse*10+digit;
            n=n/10;
        }
        return reverse;
    }
}

public class ReverseTheNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n= sc.nextInt();
        ReverseNumber rn=new ReverseNumber();
        int a= rn.reversen(n);
        System.out.println("After reversing the number will be "+a);
    }
}
