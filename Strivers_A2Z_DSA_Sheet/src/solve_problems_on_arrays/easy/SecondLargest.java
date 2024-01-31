package solve_problems_on_arrays.easy;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int [] arr = {13, 46, 24, 52, 20, 9};
        secondLargest_Optimal(arr);
        secondLargest(arr);
    }

    //Brute Force
    //After sorting return the second last element
    static void secondLargest(int [] arr){
        int secondLarge = 0;
        for(int i=0; i< arr.length; i++){
            int j = i;
            while(j > 0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        System.out.println("Second Largest Element : "+arr[arr.length-2]);
    }

    //Optimal Approach
    static void secondLargest_Optimal(int [] arr){
        int largest = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;

        for(int i=0; i< arr.length; i++){
            if(arr[i]>largest){
                secondLarge = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLarge && arr[i]!=largest){
                secondLarge = arr[i];
            }
        }
        System.out.println("Second largest element is : "+secondLarge);
    }

}
