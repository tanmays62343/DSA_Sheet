package solve_problems_on_arrays.medium;

import java.util.ArrayList;
import java.util.HashSet;

public class Leaders {
    public static void main(String[] args) {
        int[] arr=  {10, 22, 12, 3, 0, 6};
        //leaders(arr);
        leaders_optimal(arr);
    }

    //Brute Force : O(n2)
    static void leaders(int [] arr){
        HashSet<Integer> leaders = new HashSet<>();
        for(int i =0; i<arr.length; i++){
            boolean leader = true;
            for(int j = i+1; j<arr.length;j++){
                if(arr[j]>arr[i]){
                    leader = false;
                    break;
                }
            }
            if(leader){
                leaders.add(arr[i]);
            }
        }
        System.out.println(leaders);
    }

    //Optimal solution : O(n)
    //The key is to start from Back
    static void leaders_optimal(int[] arr){
        int n = arr.length;
        ArrayList<Integer> leaders = new ArrayList<>();
        int max = arr[n-1];
        leaders.add(arr[n-1]);
        for(int i = n-2; i>=0; i--){
            if(arr[i] > max){
                leaders.add(arr[i]);
                max = arr[i];
            }
        }
        System.out.println(leaders);
    }

}
