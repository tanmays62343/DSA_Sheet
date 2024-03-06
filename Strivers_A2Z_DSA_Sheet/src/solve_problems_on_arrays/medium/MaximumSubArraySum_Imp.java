package solve_problems_on_arrays.medium;

//!kadane's Algorithm
public class MaximumSubArraySum_Imp {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        //maximumSubArraySum(arr);
        //maximumSubArraySum_Better1(arr);
        maximumSubArraySum_Better2(arr);
    }

    //Brute Force : O(n2)
    //Calculating sum of all the sub Arrays
    static void maximumSubArraySum(int [] arr){
        int maxSum = 0;
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = i; j < arr.length ; j++){
                sum += arr[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        System.out.println(maxSum);
    }

    //!Kadane's Algorithm -
    //Maximum Aggregate of all the elements
    //Optimal solution : O(n)
    // Space Complexity : O(1)
    static void maximumSubArraySum_Better1(int[] arr){
        long maxSum = Long.MIN_VALUE;
        long sum = 0;
        for(int i =0; i<arr.length; i++){
            //Add elements and see there sum
            sum += arr[i];
            maxSum = Math.max(maxSum, sum);
            //Discard if sum becomes -ve
            if(sum < 0){
                sum = 0;
            }
        }
        if(maxSum < 0)
            maxSum = 0;
        System.out.println(maxSum);
    }

    //!Kadane's Algorithm - (Also Print the subArray)
    //Optimal solution : O(n)
    // Space Complexity : O(1)
    static void maximumSubArraySum_Better2(int[] arr){
        long maxSum = Long.MIN_VALUE;
        long sum = 0;
        int start = 0;

        int ansStart = -1;
        int ansEnd = -1;

        for(int i =0; i<arr.length; i++){
            if(sum == 0) start = i;  //We are doing it here because we don't want the current index where sum becomes 0
            //Add elements and see there sum
            sum += arr[i];
            if(sum > maxSum){
                maxSum = sum;
                ansStart = start;
                ansEnd = i;
            }
            //Discard if sum becomes -ve
            if(sum < 0){
                sum = 0;
            }
        }
        for(int i = ansStart; i<= ansEnd ; i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
        if(maxSum < 0)
            maxSum = 0;
        System.out.println(maxSum);
    }

}
