import java.util.Scanner;

public class Array1 {

    public static boolean isFound(int[] arr, int num) {
        int index=0;
        while(index< arr.length){
            if(arr[index]==num){
                return true;
            }
            index++;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.println("Enter the number you want to search");
        int n= sc.nextInt();
        boolean isfound= isFound(arr,n);
        if(isfound){
            System.out.println("Your number was found in the array");
        }
        else{
            System.out.println("Your number was not found in the array");
        }
    }
}
