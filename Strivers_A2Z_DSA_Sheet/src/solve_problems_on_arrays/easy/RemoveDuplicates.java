package solve_problems_on_arrays.easy;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,2,3,3,4};
        //System.out.println(removeDuplicates(arr));
        removeDuplicates_Optimal(arr);
        System.out.println(Arrays.toString(arr));
    }

    //Brute Force O(n log n) + O(n)
    //Gives number of unique elements
    static int removeDuplicates(int [] arr){
        HashSet <Integer> set = new HashSet<>();
        for (int value : arr) {
            set.add(value);
        }
        int k = set.size();
        int j = 0;
        for(int x : set){
            arr[j++] = x;
        }
        return k;
    }

    //Optimal O(n)
    //This method puts the unique elements at first
    static void removeDuplicates_Optimal(int [] arr){
        int i = 0;
        for(int j = 1; j < arr.length; j++){
            if(arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
    }

}
