package solve_problems_on_arrays.easy;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {13, 46, 24, 52, 20, 9};
        linearSearch(arr,20);
    }

    //Brute Force : O(num)
    static void linearSearch(int [] arr, int num){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == num){
                System.out.println("present at index: "+i);
                break;
            }
        }
        System.out.println("-1 Not present");
    }



}
