package solve_problems_on_arrays.hard;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int [] arr = { -1, 0, 1, 2, -1, -4};
        //System.out.println(threeSum(arr));
        System.out.println(threeSum_Better(arr));
    }

    //Brute Force : O(n3)
    static List<List<Integer>> threeSum(int [] arr){
        Set<List<Integer>> set = new HashSet<>();
        for(int i =0; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                for(int k = j+1; k< arr.length;k++){
                    if(arr[i]+arr[j]+arr[k] == 0){
                        //Adding the list of three elements to the list
                        List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k]);
                        //temp.sort(null);
                        Collections.sort(temp);
                        set.add(temp);
                    }
                }
            }
        }
        //Inflating the ans array
        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;
    }

    //Better Approach : O(n2 * log(unique triplets))
    //Using hashing
    static List<List<Integer>> threeSum_Better(int [] arr){
        Set<List<Integer>> set = new HashSet<>();
        for(int i =0; i<arr.length; i++){
            //Make a set to find the third element
            Set<Integer> hashSet = new HashSet<>();
            for(int j = i+1; j< arr.length; j++){
                int third = -(arr[i]+arr[j]);
                //Find if third element is present in the set
                if(hashSet.contains(third)){
                    List<Integer> temp = Arrays.asList(arr[i],arr[j],third);
                    temp.sort(null);
                    set.add(temp);
                }
                //Store j and move the pointer forward
                hashSet.add(arr[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;
    }

    //Optimal solution : O(n2) + O(n log n)
    static List<List<Integer>> threeSum_Optimal(int [] arr){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        //In this i will remain constant wile j and k moves
        //after j and k settles i will move
        for(int i =0; i<arr.length; i++){
            //I should not be the same
            if(i != 0 && arr[i]==arr[i-1]) continue;
            //moving two pointers
            int j = i+1;
            int k = arr.length-1;
            while(j<k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum<0)
                    j++;
                else if(sum > 0)
                    k--;
                else{
                    List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    //Skip the duplicates
                    while(j<k && arr[j] == arr[j-1]) j++;
                    while(j<k && arr[k] == arr[k+1]) k--;
                }
            }
        }
        return ans;
    }

}
