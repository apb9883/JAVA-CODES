import java.util.Scanner;

class Patterning2{
    public void pat2(int a){
        for(int i=1; i<=a; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int a=sc.nextInt();
        Patterning2 p=new Patterning2();
        p.pat2(a);
    }
}
