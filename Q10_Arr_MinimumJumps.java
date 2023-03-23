public class Q10_Arr_MinimumJumps {
    public static void main(String[] args) {
        int [] arr = {1,4,3,2,6,7};
        System.out.println(minJumps(arr));
    }
    public static int minJumps(int [] arr){
       int jump=0, start=0, end =0;
       int n = arr.length;
       for(int i=0; i<n-1; i++){
           end = Math.max(end, arr[i]+i);
           if(start == i){
               start = end;
               jump++;
           }
       }
       if(start<n-1) return -1;
       return jump;
    }
}
