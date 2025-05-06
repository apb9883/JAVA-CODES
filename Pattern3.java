import java.util.Scanner;

class Patterning3{
    public void pat3(int a){
        for(int i=1; i<=a; i++){
            for(int j=1; j<=a-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int a=sc.nextInt();
        Patterning3 p=new Patterning3();
        p.pat3(a);
    }
}
