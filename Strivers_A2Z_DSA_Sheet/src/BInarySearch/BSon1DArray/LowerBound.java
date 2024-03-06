package BInarySearch.BSon1DArray;

public class LowerBound {
    public static void main(String[] args) {
        int [] arr = {3, 5, 8, 15, 19};
        System.out.println(lowerBound(arr,9));
    }

    static int lowerBound(int [] arr, int x){

        int low = 0;
        int high = arr.length-1;
        int ans = -1;

        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] >= x){
                ans = mid;
                //Shift to take the right most answer
                high = mid-1;
            }else {
                low = mid +1;
            }
        }
        return ans;
    }
}
