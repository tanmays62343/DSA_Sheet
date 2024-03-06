package solve_problems_on_arrays.medium;

import java.util.HashMap;
import java.util.Map;

public class SubArraysSumEqualsK {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        subArraysSumEqualsK(arr,6 );
        subArraysSumEqualsK_Better(arr,6);
    }

    //Brute Force : O(n2)
    static void subArraysSumEqualsK(int [] arr, int k){
        int subArrays = 0;
        for(int i =0; i < arr.length; i++){
            int sum = 0;
            for(int j = i ; j< arr.length; j++){
                sum += arr[j];
                if(sum == k){
                    subArrays++;
                }
            }
        }
        System.out.println(subArrays);
    }

    //!Concept of prefixSum
    //Optimal solution O(n)
    static void subArraysSumEqualsK_Better(int [] arr, int k){
        Map<Integer,Integer> map = new HashMap<>();
        int preSum = 0;
        int count = 0;
        //Initially the sum is zero
        map.put(0,1);
        for(int i =0; i<arr.length; i++){
            preSum += arr[i];
            int rem = preSum - k;
            //See if it exists in the map
            count += map.getOrDefault(rem,0);
            //Update the value of prefixSum in map
            map.put(preSum,map.getOrDefault(preSum,0)+1);
        }
        System.out.println(count);
    }

}
