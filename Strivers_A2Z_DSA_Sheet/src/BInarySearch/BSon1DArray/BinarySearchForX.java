package BInarySearch.BSon1DArray;

public class BinarySearchForX {
    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 7, 9, 12, 16, 17};
        System.out.println(BinarySearch(arr, 6));
        System.out.println(BinarySearch_Recursive(arr,0,arr.length-1,6));
    }

    //Iterative Solution (O(log n))
    static int BinarySearch(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (x < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    //Recursive Solution

    static int BinarySearch_Recursive(int[] arr, int low, int high, int x) {
        if (low > high) return -1;

        int mid = (low + high) / 2;
        if (arr[mid] == x) return mid;
        else if (x > arr[mid])
            return BinarySearch_Recursive(arr, mid + 1, high, x);
        return BinarySearch_Recursive(arr, low, mid - 1, x);
    }


}
