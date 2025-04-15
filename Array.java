public class Array {
    public static void main(String[] args) {
        int[] arr=new int[5];
        arr[0]=67;
        arr[1]=76;
        arr[2]=87;
        arr[3]=98;
        arr[4]=54;

        /* or we can write
        int[] arr={67,76,87,98,54};
         */

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        System.out.println();

        int index=0;
        while(index<5){
            System.out.println(arr[index]);
            /*  we can also write
              System.out.println(arr.length);

             */
            index++;
        }
    }
}
