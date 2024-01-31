package solve_problems_on_arrays.easy;

import java.util.Arrays;

public class RotateAnArrayByN {
    public static void main(String[] args) {
        int [] arr = {13, 46, 24, 52, 20, 9};
        //rotateAnArrayByN_Better(arr,2);
        rotateAnArrayByN_Optimal(arr,2);
        //rotateAnArrayByN(arr,3);
    }

    //Left Rotate and array
    //Brute Force : O(n2)
    static void rotateAnArrayByN(int [] arr, int n){
        for(int k =1; k <= n; k++) {      //If we want to rotate it by n places
        //Store first element in temp variable then shift all to left and place it in last
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    //Better Approach : O(n)
    static void rotateAnArrayByN_Better(int [] arr, int k){
        if(arr.length == 0){
            return ;
        }

        k = k % arr.length;
        if (k > arr.length)
            return;

        int [] temp = new int [k];

        //Putting the k elements in the temporary array
        for(int i=0; i<k; i++){
            temp[i] = arr[i];
        }
        //Shifting the elements after kth index at front
        for(int i=0; i<arr.length-k; i++){
            arr[i] = arr[i+k];
        }
        //Putting the elements from temporary array to original array at back
        for(int i = arr.length-k; i< arr.length; i++ ){
            arr[i] = temp[i- arr.length + k];
        }
        System.out.println(Arrays.toString(arr));
    }

    //Optimal Approach : O(n)
    //Optimized space Complexity in this
    static void rotateAnArrayByN_Optimal(int [] arr, int k){
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    //Helper Function
    static void reverse(int [] arr, int start, int end)
    {
        while (start <= end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
