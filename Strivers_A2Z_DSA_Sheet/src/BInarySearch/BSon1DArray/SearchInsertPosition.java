package BInarySearch.BSon1DArray;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,7};
        System.out.println(searchInsertPosition(arr,5));
    }

    static int searchInsertPosition(int [] arr, int x){
        int low = 0;
        int high = arr.length-1;
        int ans = arr.length;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>=x){
                ans = mid;
                high = mid -1;
            }else {
                low = mid +1;
            }
        }
        return ans;
    }

}
