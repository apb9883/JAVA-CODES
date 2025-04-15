import java.util.Scanner;

public class CategorizeAgeGroup {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age ");
        int a = sc.nextInt();
        if(a>=60){
            System.out.println("Senior Citizen");
        } else if (a<60 && a>=20) {
            System.out.println("Adult Citizen");
        } else if (a<20 && a>=13) {
            System.out.println("Teen");
        }
        else{
            System.out.println("Child");
        }
    }
}
