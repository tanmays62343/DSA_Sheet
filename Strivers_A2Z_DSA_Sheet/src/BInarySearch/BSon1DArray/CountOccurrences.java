package BInarySearch.BSon1DArray;

import java.util.Arrays;

public class CountOccurrences {

    public static void main(String[] args) {
        int[] arr =  {2, 4, 6, 8, 8, 8, 11, 13};
        System.out.println(Arrays.toString(countOccurrences(arr,8)));
    }

    //Optimal solution : O(2log n)
    static int[] countOccurrences(int [] arr, int n){
        int firstOccurrence = firstOccurrence(arr,n);
        if(firstOccurrence == -1) return new int [] {-1,-1};
        int lastOccurrence = lastOccurrence(arr,n);
        System.out.println("Number of occurrence : "+(lastOccurrence-firstOccurrence+1));
        return new int [] {firstOccurrence,lastOccurrence};
    }

    //Helper Function : O(log n)
    static int firstOccurrence(int [] arr, int x){
        int first = 0;
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == x){
                first = mid;
                high = mid-1;
            } else if(arr[mid] > x){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return first;
    }

    //Helper Function : O(log n)
    static int lastOccurrence(int [] arr, int x){
        int last = 0;
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == x){
                last = mid;
                low = mid+1;
            } else if(arr[mid] > x){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return last;
    }

}
