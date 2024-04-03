package BInarySearch.BSon1DArray;


//When the array contains duplicate elements
public class SearchInRotatedArray2 {
    public static void main(String[] args) {
        int[] arr = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        System.out.println(searchInRotatedArray(arr,3));
    }

    //Optimal solution : O(n/2)
    static boolean searchInRotatedArray(int [] arr, int x){
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = (low+high)/2;

            if(arr[mid] == x){
                return true;
            }

            //Edge case if the low, mid and high are same
            if(arr[low] == arr[mid] && arr[mid] == arr[high]){
                low = low +1;
                high = high -1;
                continue;
            }

            //If Left half is sorted
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= x && x <= arr[mid]) {
                    //element exists
                    high = mid - 1;
                } else {
                    //element does not exist
                    low = mid + 1;
                }
            } else { //if right part is sorted
                if (arr[mid] <= x && x <= arr[high]) {
                    //element exists
                    low = mid + 1;
                } else {
                    //element does not exist
                    high = mid - 1;
                }
            }
        }
        return false;
    }

}
