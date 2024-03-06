package solve_problems_on_arrays.hard;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumZero {
    public static void main(String[] args) {
        int [] arr = {9, -3, 3, -1, 6, -5};
        //longestSubArrayWithSumZero(arr);
        longestSubArrayWithSumZero_Optimal(arr);
    }

    //Brute Force : O(n2)
    static void longestSubArrayWithSumZero(int [] arr){
        int longestSubArray = 0;
        for(int i =0; i<arr.length; i++){
            int sum =0;
            for(int j = i; j<arr.length; j++){
                sum += arr[j];
                if(sum == 0){
                    longestSubArray = Math.max(longestSubArray, j-i+1);
                }
            }
        }
        System.out.println(longestSubArray);
    }

    //Optimal solution : O(n)
    static void longestSubArrayWithSumZero_Optimal(int [] arr){
        Map<Integer,Integer> map = new HashMap<>();
        //Storing key Value pair in format of - [sum, index]
        int maxSubArrayLen = -1;
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
            if(sum == 0){
                maxSubArrayLen = Math.max(maxSubArrayLen,i);
            } else {
                //if current sum is present in map the elements after it must have had sum zero
                if(map.get(sum) != null){
                    maxSubArrayLen = Math.max(maxSubArrayLen, i - map.get(sum));
                }else{
                    map.put(sum,i);
                }
            }
        }
        System.out.println(maxSubArrayLen);
    }

}
