package BInarySearch.BSon1DArray;

public class SearchInRotatedArray1 {
    public static void main(String[] args) {
        int [] arr = {7, 8, 9, 1, 2, 3, 4, 5, 6};
        System.out.println(searchInRotatedArray(arr,9));
    }

    //Optimal solution : O (log n)
    static int searchInRotatedArray(int [] arr, int x){
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid]==x)
                return mid;
            //Check if left part is sorted
            if(arr[low] <= arr[mid]){
                //check if our element lies in that part
                if(arr[low]<=x && x<=arr[mid]){
                    high = mid-1;
                //if not check in other half
                }else {
                    low = mid +1;
                }
            //If left is not sorted check in right
            } else {
                //check if our element lies in that part
                if(arr[mid] <= x && x <= arr[high]){
                    low = mid +1;
                //if not check in other half
                }else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

}
