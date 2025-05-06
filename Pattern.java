import java.util.Scanner;

class Patterning{
    public void pat(int a, int b){
        for(int i=1; i<=a; i++){
            for(int j=1; j<=b; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int a=sc.nextInt();
        System.out.println("Enter the number of columns");
        int b=sc.nextInt();
        Patterning p=new Patterning();
        p.pat(a,b);
    }
}
