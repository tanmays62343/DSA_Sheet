package solve_problems_on_arrays.easy;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        //moveAllZeros(arr);
        moveAllZeros_Optimal(arr);
    }

    //Brute Force : O(n) [Not Stable]
    static void moveAllZeros(int [] arr){
        int end = arr.length-1;
        int n = arr.length-1;

        for(int i=0; i<n; i++){
            if(arr[i] == 0 && end > 0){
                int temp = arr[end];
                arr[end] = arr[i];
                arr[i] = temp;
                end--;
                n--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //Optimal Solution : O(n) [Stable]
    static void moveAllZeros_Optimal(int [] arr){
        int j = -1;
        //place the pointer j on a zero
        for(int i=0; i< arr.length; i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        if(j==-1) return;
        //Now move both pointers and swap
        for(int i = j+1; i<arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
