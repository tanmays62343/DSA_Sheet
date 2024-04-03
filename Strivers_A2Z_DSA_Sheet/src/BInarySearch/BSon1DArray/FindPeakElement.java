package BInarySearch.BSon1DArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindPeakElement {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 5, 1};
        //findPeakElement_Brute(arr);
        System.out.println(findPeakElement_Optimal(arr));
    }

    //Brute Force : O(n)
    static void findPeakElement_Brute(int [] arr){
        System.out.println("The Peak Elements are : ");
        for(int i = 0; i < arr.length; i++){
            //If corners are considered as peaks
            //if not remove below code and start from second element to last second element
            if(i==0 || i == arr.length-1){
                System.out.println(arr[i]);
                continue;
            }
            if(arr[i]>arr[i+1] && arr[i] > arr[i-1]){
                System.out.println(arr[i]);
            }
        }
    }

    //Optimal solution : O(log n)
    static List<Integer> findPeakElement_Optimal(int [] arr){
        List<Integer> peaks = new ArrayList<>();
        int n = arr.length;

        if(n == 0) return peaks;

        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if((mid == 0 || arr[mid] > arr[mid - 1])
                    && (mid == n - 1 || arr[mid] > arr[mid + 1])){
                peaks.add(arr[mid]);
                break;
            } else if (arr[mid]>arr[mid-1]) {
                low = mid+1;
            } else {
                high = mid - 1;
            }
        }
        return peaks;
    }
}
