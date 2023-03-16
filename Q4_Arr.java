import java.util.Arrays;

public class Q4_Arr {               //Sort the array of 0,1,2s without using any Algo
    public static void main(String[] args) {
        int [] arr = {2,2,1,0,1,2,0};
        sort012(arr);
    }

    public static void sort012(int [] arr){
       int lo = 0;
       int mid=0, temp=0;
       int hi = arr.length-1;

       while(mid<=hi){
           switch (arr[mid]){
               case 0: {
                   temp = arr[lo];
                   arr[lo] = arr[mid];
                   arr[mid] = temp;
                   lo++;
                   mid++;
                   break;
               }
               case 1 : {
                   mid++;
                   break;
               }
               case 2 : {
                   temp = arr[mid];
                   arr[mid] = arr[hi];
                   arr[hi] = temp;
                   hi--;
                   break;
               }
           }
       }
        System.out.println(Arrays.toString(arr));
    }
}
