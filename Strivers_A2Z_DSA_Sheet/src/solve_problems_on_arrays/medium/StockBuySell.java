package solve_problems_on_arrays.medium;

public class StockBuySell {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        stockBuySell(arr);
    }

    //Brute Force : O(n)
    static void stockBuySell(int [] arr){
        int minimum = Integer.MAX_VALUE;
        int minimumIndex = 0;

        int maximum = Integer.MIN_VALUE;

        for(int i =0; i< arr.length; i++){
            if(arr[i] < minimum){
                minimum = arr[i];
                minimumIndex = i;
            }
            if(arr[i] > maximum && i > minimumIndex){
                maximum = arr[i];
            }
        }

        System.out.println("We Buy on Day "+minimum+" and sell on "+maximum);
        System.out.println("Profit is " + (maximum-minimum) );
    }
}
