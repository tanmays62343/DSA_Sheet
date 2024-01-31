package solve_problems_on_arrays.easy;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayOfSumK {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 9};
        //longestSubArrayOfSumK(arr,10);
        //longestSubArrayOfSumK_Better(arr,10);
        longestSubArrayOfSumK_Optimal(arr, 10);
    }

    //Brute Force : O(n2)
    //Creating all the sub Arrays and finding their sum
    static void longestSubArrayOfSumK(int[] arr, int sub) {
        int subArrayLen = -1;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == sub) {
                    subArrayLen = Math.max(subArrayLen, j - i + 1);
                }
            }
        }
        System.out.println(subArrayLen);
    }

    //Better solution : O(n log n) [cause finding in map takes log n]
    //Hashing (complex see dry run video)
    //Works for +ve/ -ve and 0s.  (max Optimized)
    static void longestSubArrayOfSumK_Better(int[] arr, int sub) {
        Map<Long, Integer> sumMap = new HashMap<>();
        long sum = 0;
        int subArrayLen = -1;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == sub) {
                subArrayLen = Math.max(subArrayLen, i + 1);
            }
            long rem = sum - sub;
            if (sumMap.containsKey(rem)) {
                int len = i - sumMap.get(rem);
                subArrayLen = Math.max(subArrayLen, len);
            }
            //Imagine if we have zeros in the array
            //The Index will be updated Which we don't want
            //we want the left most Index.
            if (!sumMap.containsKey(sum)) {
                sumMap.put(sum, i);
            }
        }
        System.out.println(subArrayLen);
    }

    //Optimal Approach : O(2n) [Because inner loop runs for n overall and not all the time]
    //Two Pointer Approach
    //Only for +ve
    static void longestSubArrayOfSumK_Optimal(int[] arr, int sub) {
        int left = 0;
        int right = 0;
        long sum = arr[0];
        int subArrayLen = 0;
        while (right < arr.length) {
            while (left <= right && sum > sub) {
                sum -= arr[left];
                left++;
            }
            if (sum == sub) {
                subArrayLen = Math.max(subArrayLen, right - left + 1);
            }
            sum += arr[right];
            right++;
        }
        System.out.println(subArrayLen);
    }

}
