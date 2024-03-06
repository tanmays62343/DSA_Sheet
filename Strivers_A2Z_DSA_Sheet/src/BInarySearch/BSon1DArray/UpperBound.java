package BInarySearch.BSon1DArray;

public class UpperBound {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 9, 15, 19};
        System.out.println(upperBound(arr,9));
    }

    static int upperBound(int [] arr, int x){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] > x){
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }
        return ans;
    }

}
