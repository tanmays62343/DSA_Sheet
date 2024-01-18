package basics.recursion;

import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1} ;
        reverseAnArray(arr,0,4);       //Comment one to Test
        reverseAnArray_Iterative(arr);
    }

    //Recursive Solution
    static void reverseAnArray(int [] arr,int start,int end){
        if(start>end){
            System.out.println(Arrays.toString(arr));
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseAnArray(arr,start+1,end-1);
    }

    //Iterative Solution
    static void reverseAnArray_Iterative(int [] arr){
        int p1 = 0;
        int p2 = arr.length-1;

        while(p1<p2){
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;

            p1++;
            p2--;
        }

        System.out.println(Arrays.toString(arr));
    }

}
