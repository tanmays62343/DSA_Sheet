import java.util.Arrays;

public class Q9_Arr_HeightDifference {
    public static void main(String[] args) {
        int [] arr = {2,6,3,4,7,2,10,3,2,1};
        System.out.println(getMinDiff(arr,5));
    }
    public static int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr);
        int dif =  arr[n-1]-arr[0]; //possible maximum diff
        int min , max;
        for(int i=1;i<n;i++){
            if(arr[i]-k<0) continue;
            min = Math.min(arr[0]+k,arr[i]-k);
            max = Math.max(arr[n-1]-k,arr[i-1]+k);
            dif = Math.min(dif,max-min);
        }
        return dif;

    }
    /*public static int HeightDifference(int [] arr,int k){
        int res;
        int n = arr.length;
        int max = 0;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i]-k > 0){
                arr[i] = arr[i]-k;
            }
            else{
                arr[i] = arr[i]+k;
            }
            if(max<arr[i])
                max = arr[i];
            if(min>arr[i])
                min = arr[i];
        }
        res = max-min;
        return res;
    }*/
}
