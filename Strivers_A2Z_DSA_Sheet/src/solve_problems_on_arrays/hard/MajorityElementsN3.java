package solve_problems_on_arrays.hard;

import java.util.ArrayList;

public class MajorityElementsN3 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,2};
        majorityElements(arr);
    }


    //!Moore's voting Algorithm Extended Version
    //Optimal solution : O(2n)
    static void majorityElements(int[] arr) {
        int element1 = 0;
        int element2 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count1 == 0 && arr[i] != element2) {
                count1 = 1;
                element1 = arr[i];
            } else if (count2 == 0 && arr[i] != element1) {
                count2 = 1;
                element2 = arr[i];
            } else if (arr[i] == element1) {
                count1++;
            } else if (arr[i] == element2) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        //Now Verify (Not to do if mentioned majority element present)
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i : arr){
            if(i == element1) count1++;
            if(i == element2) count2++;
        }
        int min = arr.length/3 + 1;
        if(count1>min) ans.add(element1);
        if(count2>min) ans.add(element2);
        System.out.println(ans);
    }

}
