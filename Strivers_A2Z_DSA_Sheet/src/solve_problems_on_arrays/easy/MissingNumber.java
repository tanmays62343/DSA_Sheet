package solve_problems_on_arrays.easy;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int [] arr = {1, 2, 4, 5};
        //findMissingNumber(arr);
        findMissingNumber_Better(arr);
    }

    //Brute Force : O(n2) + O(n)
    static void findMissingNumber(int [] arr){
        Arrays.sort(arr);
        for(int i = 1; i< arr.length; i++){
            if(arr[i] != arr[i-1]+1){
                System.out.println("The Missing element is : "+(arr[i-1]+1));
            }
        }
    }

    //Better Approach : O(n)
    //space complexity : O(n) + O(n+1)
    static void findMissingNumber_Better(int [] arr){
        int n = arr.length;
        int [] hash = new int[n+1];

        for(int i = 0; i < arr.length-1 ; i++){
            hash[arr[i]] = 1; //we can also write hash[arr[i]]++ for this
        }
        for(int i =1; i<=n ; i++){
            if(hash[i] == 0){
                System.out.println("Missing number : "+i);
            }
        }
    }

    //Optimal Approach 1 : O(n)
    //Space Complexity : O(1)
    //Sum of n numbers
    static void findMissingNumber_Optimal1(int [] arr){
        int n = arr.length;
        int sum = (n * (n+1)/2);

        //sum of all array elements
        int s = 0;
        //TODO
    }


}
