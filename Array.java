import java.util.Scanner;

public class Array {

    public static void printArray(int[][] array) {

        System.out.println("The 2d Array is");
        int i=0;
        while(i<array.length){
            int j=0;
            while(j<array[i].length){
                System.out.print(array[i][j]+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static int[][] twoDimensionalArray() {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the number of rows");
          int n= sc.nextInt();
          System.out.println("Enter the number of columns");
          int m= sc.nextInt();
          int[][] array=new int[n][m];
          int i=0;
          while(i< array.length){
              int j=0;
              while(j<array[i].length){
                  array[i][j]=sc.nextInt();
                  j++;
              }
              i++;
          }
          return array;
    }

    public static void main(String[] args) {
        int[][] array=twoDimensionalArray();
        printArray(array);
    }
}
