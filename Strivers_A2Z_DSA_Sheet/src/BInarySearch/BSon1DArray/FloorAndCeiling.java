package BInarySearch.BSon1DArray;

public class FloorAndCeiling {
    public static void main(String[] args) {
        int [] arr = {3, 4, 4, 7, 8, 10};
        floorAndCeiling(arr,5);
    }

    static void floorAndCeiling(int [] arr, int x){
        int low = 0;
        int high = arr.length-1;
        int floor = 0;
        int ceiling = arr.length;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid]>=x){
                ceiling = arr[mid];
                high = mid-1;
            } else {
                floor = arr[mid];
                low = mid+1;
            }
        }
        System.out.println("Floor: "+floor+" "+"Ceiling: "+" "+ceiling);
    }

}
