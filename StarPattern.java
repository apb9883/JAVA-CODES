import java.util.Scanner;

public class StarPattern {

    public static void starPattern() {

        int i=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number where star to be pattern ");
        int a=sc.nextInt();
        while(i<a){
            int j=0;
            while(j<i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void main(String[] args) {
        starPattern();
    }
}
