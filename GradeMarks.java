import java.util.Scanner;

public class GradeMarks {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks ");
        int a = sc.nextInt();
        if(a>=90){
            System.out.println("Grade A");
        } else if (a<90 && a>=75) {
            System.out.println("Grade B");
        } else if (a<75 && a>=60) {
            System.out.println("Grade C");
        }
        else if (a<60 && a>=30) {
            System.out.println("Grade D");
        }
        else{
            System.out.println("Grade F");
        }
    }
}
