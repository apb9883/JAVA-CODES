import java.util.Scanner;

class Patterning1{
    public void pat1(int a, int b){
        for(int i=1; i<=a; i++){
            for(int j=1; j<=b; j++){
                if(i==1 || i==a || j==1 || j==b){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int a=sc.nextInt();
        System.out.println("Enter the number of columns");
        int b=sc.nextInt();
        Patterning1 p=new Patterning1();
        p.pat1(a,b);
    }
}
