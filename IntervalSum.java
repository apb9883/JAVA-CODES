import java.util.Scanner;

class Interval{
    public int sum(int n){
        int ans=0;
        for(int i=1; i<=n; i++){
            if(i%2==0){
                ans=ans-i;
            }
            else{
                ans=ans+i;
            }
        }
     return ans;
    }
}

public class IntervalSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number ");
        int n= sc.nextInt();
        Interval i=new Interval();
        int a=i.sum(n);
        System.out.println("Sum of interval upto n is " +a);
    }
}
