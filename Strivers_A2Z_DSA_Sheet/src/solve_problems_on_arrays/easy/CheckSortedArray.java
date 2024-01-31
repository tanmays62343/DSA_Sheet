package solve_problems_on_arrays.easy;

public class CheckSortedArray {
    public static void main(String[] args) {
        int [] arr = {13, 46, 24, 52, 20, 9};
        System.out.println(checkSortedArray_Optimal(arr));
    }

    //Optimized
    static boolean checkSortedArray_Optimal(int [] arr){
        for(int i = 1; i<arr.length; i++){
            if(arr[i-1]>arr[i])
                return false;
        }
        return true;
    }

    //Brute Force
    static boolean checkSortedArray(int [] arr){
        for(int i = 0; i< arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                if(arr[j]<arr[i]){
                    return false;
                }
            }
        }
        return true;
    }

}
