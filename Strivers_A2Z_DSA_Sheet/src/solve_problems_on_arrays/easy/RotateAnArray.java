package solve_problems_on_arrays.easy;

import java.util.Arrays;

//Left Rotate an Array
//Time complexity O(n)
public class RotateAnArray {
    public static void main(String[] args) {
        int [] arr = {13, 46, 24, 52, 20, 9};
        rotateAnArray(arr,1);
    }

    //Left Rotate an array
    static void rotateAnArray(int [] arr,int n){
        //for(int k =1; k <= n; k++) {      //If we want to rotate it by n places
            //Store first element in temp variable then shift all to left and place it in last
            int temp = arr[0];
            for (int i = 1; i < arr.length; i++) {
                arr[i - 1] = arr[i];
            }
            arr[arr.length - 1] = temp;
        //}
        System.out.println(Arrays.toString(arr));
    }

}
