import java.util.Scanner;

class Patterning4{
    public void pat4(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=2*i-1; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int a=sc.nextInt();
        Patterning4 p=new Patterning4();
        p.pat4(a);
    }
}
