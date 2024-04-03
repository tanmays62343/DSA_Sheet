package BInarySearch.BSon1DArray;

public class FindSingleElement {
    public static void main(String[] args) {
        int [] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
        System.out.println(findSingleElement(arr));
    }

    //Better Solution : O(n)
    static int findSingleElement(int [] arr){
        int ans = 0;
        for(int i =0; i < arr.length; i++){
            ans = ans ^ arr[i];
        }
        return ans;
    }

    /*//Optimal solution : O()
    static int findSingleElement_Optimal(int [] arr){
        int n = arr.length;

        //Edge Cases
        if(n == 1)
            return arr[0];
        if(arr[0] != arr[1])
            return arr[0];
        if(arr[n-1] != arr[n-2])
            return arr[n-1];

        int low = 1;
        int high = n-2;

        while (low <= high){
            int mid = (low+high)/2;

            //If mid-element is single
            if(arr[mid] != arr[mid+1] && arr[mid] != arr[mid-1]){
                return arr[mid];
            }
        }

    }*/



}
