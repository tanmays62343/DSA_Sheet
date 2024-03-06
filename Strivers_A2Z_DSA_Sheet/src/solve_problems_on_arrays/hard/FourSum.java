package solve_problems_on_arrays.hard;

import java.util.*;

public class FourSum {
    public static void main(String[] args) {
        int[] arr = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
        //System.out.println(fourSum(arr,9));
        //System.out.println(fourSum_Better(arr,9));
        System.out.println(fourSum_Optimized(arr,9));
    }

    //Brute Force : O(n4)
    static List<List<Integer>> fourSum(int [] arr, int target){
        Set<List<Integer>> set = new HashSet<>();
        for(int i =0; i<arr.length; i++){
            for(int j =i+1; j<arr.length; j++){
                for(int k = j+1; k<arr.length; k++){
                    for(int l = k+1; l<arr.length; l++){
                        if(arr[i]+arr[j]+arr[k]+arr[l] == target){
                            List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
                            //temp.sort(null);
                            Collections.sort(temp);
                            set.add(temp);
                        }
                    }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;
    }

    //Better approach : O(n3)
    static List<List<Integer>> fourSum_Better(int [] arr, int target){
        Set<List<Integer>> set = new HashSet<>();
        for(int i =0; i<arr.length;i++){
            for(int j =i+1; j<arr.length;j++){
                HashSet<Integer> hashSet = new HashSet<>();
                for(int k = j+1; k<arr.length; k++){
                    int sum = arr[i]+ arr[j]+ arr[k];
                    int fourth = target-sum;
                    if(hashSet.contains(fourth)){
                        List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k],fourth);
                        Collections.sort(temp);
                        set.add(temp);
                    }
                    hashSet.add(arr[k]);
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;
    }

    //Optimized solution : O(n3)
    //Space Complexity : O(1)
    static List<List<Integer>> fourSum_Optimized(int[] arr, int target) {
        int n = arr.length; // size of the array
        List<List<Integer>> ans = new ArrayList<>();
        // sort the given array:
        Arrays.sort(arr);
        // calculating the quadruplets:
        for (int i = 0; i < n; i++) {
            // avoid the duplicates while moving i
            if (i != 0 && arr[i] == arr[i - 1]) continue;
            for (int j = i + 1; j < n; j++) {
                // avoid the duplicates while moving j
                if (j > i + 1 && arr[j] == arr[j - 1]) continue;
                // 2 pointers
                int k = j + 1;
                int l = n - 1;
                while (k < l) {
                    long sum = arr[i];
                    sum += arr[j];
                    sum += arr[k];
                    sum += arr[l];
                    if (sum == target) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        temp.add(arr[l]);
                        ans.add(temp);
                        k++;
                        l--;
                        // skip the duplicates:
                        while (k < l && arr[k] == arr[k - 1]) k++;
                        while (k < l && arr[l] == arr[l + 1]) l--;
                    } else if (sum < target) k++;
                    else l--;
                }
            }
        }
        return ans;
    }

}
