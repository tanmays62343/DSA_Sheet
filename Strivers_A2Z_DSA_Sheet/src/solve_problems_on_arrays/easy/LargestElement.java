package solve_problems_on_arrays.easy;

public class LargestElement {
    public static void main(String[] args) {
        int [] arr =  {2,5,1,3,0};
        findLargest(arr);
    }



    //Brute Force
    static void findLargest(int [] arr){
        int largest = 0;

        for (int j : arr) {
            if (j > largest) {
                largest = j;
            }
        }
        System.out.println("Largest Element is : "+largest);
    }

}
