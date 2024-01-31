package solve_problems_on_arrays.easy;

import java.util.HashSet;

public class FindIntersection {
    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] arr2 = {2, 3, 4, 4, 5, 11, 12};
    }

    //Brute Force : O(n)
    //Finding out common elements from both arrays
    static void findIntersection(int [] arr1, int [] arr2){
        HashSet<Integer> union = new HashSet<>();
        int n1 = Math.max(arr1.length, arr2.length);
        int n2 = Math.min(arr1.length, arr2.length);
        for(int i=0; i<n1; i++){
            for(int j=0; j<n2; j++){
                if(arr1[i] == arr2[j]){
                    union.add(arr1[i]);
                }
            }
        }
        System.out.println(union);
    }
}
