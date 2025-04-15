import java.util.Scanner;

public class Array2 {

    public static int[] inputArray() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements ");
        int num=sc.nextInt();
        int[] arr=new int[num];
        int i=0;
        while(i<arr.length){
            arr[i]=sc.nextInt();
            i++;
        }
        return arr;
    }

    public static void printArray(int[] array) {
        int index=0;
        while (index<array.length){
            System.out.println(array[index]);
            index++;
        }
    }

    public static void main(String[] args) {

        int[] array=inputArray();
        printArray(array);
    }
}
