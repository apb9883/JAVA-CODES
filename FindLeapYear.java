import java.util.Scanner;

class LeapYear {
    public void year(int y) {
        if (y%400 == 0) {
            System.out.println("Leap Year");
            }
        else if (y%100 !=0 && y%4==0) {
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a leap year");
        }
         }
    }

public class FindLeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year ");
        int n=sc.nextInt();
        LeapYear ly=new LeapYear();
        ly.year(n);
    }
}
