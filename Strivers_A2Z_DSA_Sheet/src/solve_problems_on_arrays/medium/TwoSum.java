package solve_problems_on_arrays.medium;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        twoSum(arr, 14);
    }

    //Optimal Solution : O(n)
    //Two Pointer Approach
    static void twoSum(int [] arr, int k){
        int right = arr.length-1;
        int left = 0;
        while (left <= right){
            if(arr[left] + arr[right] == k){
                System.out.println(arr[left]+ " " + arr[right]);
                break;
            }
            if(arr[left] + arr[right] > k){
                right--;
            }
            if(arr[left] + arr[right] < k){
                left++;
            }
        }
    }

    //Hashing Approach : O(n)
    static void towSum_Hashing(int [] arr, int k){
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i =0; i < arr.length; i++){
            int num = arr[i];
            int needed = k -num;
            if(map.containsKey(needed)){
                System.out.println("Pair Present");
                break;
            }
            map.put(arr[i],i);
        }
        System.out.println("Pair not Present");
    }

}
