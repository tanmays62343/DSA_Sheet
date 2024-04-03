package BInarySearch.BSon1DArray;

// Note - This solution is for right rotation
public class FindRotatedNumber {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 0, 1, 2};
        //System.out.println(findRotatedNumber(arr));
        System.out.println(findRotatedNumber_Optimal(arr));
        System.out.println(findRotatedNumber_Optimal_Left(arr));
    }

    //Brute Force : O(n)
    static int findRotatedNumber(int [] arr){
        int element = Integer.MAX_VALUE;
        int index = -1;
        for(int i =0; i< arr.length; i++){
            if(arr[i]<element){
                element = arr[i];
                index = i;
            }
        }
        return index;
    }

    //Optimal solution : O(log n) - right rotation
    static int findRotatedNumber_Optimal(int [] arr){
        int index = -1;  // index of smallest is the times array has been rotated
        int low = 0;
        int high = arr.length-1;
        int element = Integer.MAX_VALUE;

        while(low<=high){
            int mid = (low+high)/2;

            if(arr[low] <= arr[high]){
                if(arr[low] < element){
                    index = low;
                    element = arr[low];
                }
                break;
            }
            //If left part is sorted take the smallest element and then check other half
            if(arr[low]<=arr[mid]){
                if(arr[low]<element){
                    element = arr[low];
                    index = low;
                }
                //eliminate left half
                low = mid+1;
            }else {
                if(arr[mid] < element){
                    element = arr[mid];
                    index = mid;
                }
                //eliminate right half
                high = mid-1;
            }
        }
        return index;
    }

    //Optimal solution : O(log n) - Left Rotation
    static int findRotatedNumber_Optimal_Left(int [] arr){
        int index = -1;  // index of smallest is the times array has been rotated
        int low = 0;
        int high = arr.length-1;
        int element = Integer.MAX_VALUE;

        while(low<=high){
            int mid = (low+high)/2;

            if(arr[low] <= arr[high]){
                if(arr[low] < element){
                    index = low;
                    element = arr[low];
                }
                break;
            }
            //If left part is sorted take the smallest element and then check other half
            if(arr[low]<=arr[mid]){
                if(arr[low]<element){
                    element = arr[low];
                    index = low;
                }
                //eliminate left half
                low = mid+1;
            }else {
                if(arr[mid] < element){
                    element = arr[mid];
                    index = mid;
                }
                //eliminate right half
                high = mid-1;
            }
        }
        return arr.length-index;
    }

}
