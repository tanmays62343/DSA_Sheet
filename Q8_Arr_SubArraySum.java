public class Q8_Arr_SubArraySum {
    public static void main(String[] args) {                //Largest sum of contiguous subArray (Kadane's algo)

    }
    public static int MaxSumSubArray(int [] arr){
        int maxEnding = arr[0];
        int result = arr[0];
        int n = arr.length;

        for(int i=1; i<n; i++){
            maxEnding = Math.max(maxEnding+arr[i] , arr[i]);
            result = Math.max(maxEnding, result);
        }
        return result;
    }
}
