package solve_problems_on_arrays.medium;

import java.util.Arrays;

public class Arrange1s2sAnd3s_Imp {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 2, 0, 1};
        arrange1s2sAnd3s(arr);
    }

    //First Approach : Arrays.sort : O(n log n)
    //Second Approach : Count 1s, 2s and 3s and set them explicitly

    //Third Approach : O(n)
    //TODO : Dutch National Flag Algorithm {see video}
    //Three Pointer Approach
    static void arrange1s2sAnd3s(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
