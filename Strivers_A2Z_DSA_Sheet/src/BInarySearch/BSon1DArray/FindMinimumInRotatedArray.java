package BInarySearch.BSon1DArray;

public class FindMinimumInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        System.out.println(findMinimum_Better(arr));
    }

    //Better Approach : O(log n)
    static int findMinimum_Better(int [] arr){
        int low = 0;
        int high = arr.length-1;
        int ans = Integer.MAX_VALUE;
        while(low <= high){
            int mid = (low+high)/2;
            //If left half is sorted
            if(arr[low] <= arr[mid]){
                ans = Math.min(ans,arr[low]);
                low = mid + 1;
            //If right part is sorted
            } else {
                ans = Math.min(ans,arr[mid]);
                high = mid-1;
            }
        }
        return ans;
    }

    //Optimal solution : O(log n)
    static int findMinimum_Optimal(int [] arr){
        int low = 0;
        int high = arr.length-1;
        int ans = Integer.MAX_VALUE;
        while(low<=high){
            int mid = (low+high)/2;
            //If the array is completely sorted
            if(arr[low] <= arr[high]){
                ans = Math.min(ans,arr[low]);
                break;
            }
            //If the left half is sorted
            if(arr[low] <= arr[mid]){
                ans = Math.min(ans, arr[low]);
                low = mid +1;
            }
            //If right half is sorted
            else {
                ans = Math.min(ans, arr[mid]);
                high = mid -1;
            }
        }
        return ans;
    }

}
