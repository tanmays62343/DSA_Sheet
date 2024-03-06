package BInarySearch.BSon1DArray;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        int [] arr = {2, 4, 6, 8, 8, 8, 11, 13};
        firstAndLastIndex_Optimized(arr,8);
    }

    //Brute Force : O(n)
    static void firstAndLastIndex(int [] arr, int x){
        int first = -1;
        int last = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                if(first == -1) first = i;
                last = i;
            }
        }
        System.out.println(first+" "+last);
    }


    //Optimized solution : O(2log n)
    static void firstAndLastIndex_Optimized(int [] arr, int x){
        System.out.println("First Index : "+firstIndex(arr,x)+" Last Index: "+lastIndex(arr,x));
    }

    //Helper Function
    static int firstIndex(int [] arr, int x){
        int low = 0;
        int high = arr.length-1;
        int firstIndex = -1;

        while (low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == x){
                firstIndex = mid;
                high = mid -1;
            }else if(arr[mid] < x){
                low = mid +1;
            } else {
                high = mid-1;
            }
        }
        return firstIndex;
    }

    //Helper Function
    static int lastIndex(int [] arr, int x){
        int low = 0;
        int high = arr.length-1;
        int LastIndex = -1;

        while (low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == x){
                LastIndex = mid;
                low = mid+1;
            }else if(arr[mid] < x){
                low = mid +1;
            } else {
                high = mid-1;
            }
        }
        return LastIndex;
    }

}
