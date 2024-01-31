package solve_problems_on_arrays.easy;

import java.util.ArrayList;
import java.util.HashSet;

public class FindUnion {
    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] arr2 = {2, 3, 4, 4, 5, 11, 12};

        //findUnion(arr1,arr2);
        findUnion_TwoPointer(arr1, arr2);
    }

    //Hash set Approach : Not sure(TC)
    static void findUnion(int [] arr1, int [] arr2){
        int n = arr1.length;
        int m = arr2.length;
        HashSet<Integer> union = new HashSet<>();
        for (int i : arr1) {
            union.add(i);
        }
        for (int i : arr2) {
            union.add(i);
        }
        System.out.println(union);
    }

    //Two Pointer Approach
    static void findUnion_TwoPointer(int [] arr1, int [] arr2){
        int i = 0;
        int j = 0;
        ArrayList<Integer> union = new ArrayList<>();
        //Compare elements from both arrays and add it in Union
        while (i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                if(union.isEmpty() || union.get(union.size()-1) != arr1[i]){
                    union.add(arr1[i]);
                }
                i++;
            } else {
                if(union.isEmpty() || union.get(union.size()-1) != arr2[j]){
                    union.add(arr2[j]);
                }
                j++;
            }
        }
        //If elements are left in arr1
        while(i < arr1.length){
            if(union.get(union.size()-1) != arr1[i]){
                union.add(arr1[i]);
            }
            i++;
        }
        //If elements are left in arr2
        while(j < arr2.length){
            if(union.get(union.size()-1) != arr2[j]){
                union.add(arr2[j]);
            }
            j++;
        }
        System.out.println(union);
    }

}
