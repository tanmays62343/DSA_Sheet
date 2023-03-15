public class Q2_Arr {
    public static void main(String[] args) {
        int [] arr = {10,20,60,40,50};
        MaxMin(arr);
    }
    public static void MaxMin(int [] arr){  // Find Minimum and Maximum in the Array

        int n = arr.length;
        int max = 0 ,min = Integer.MAX_VALUE;
        for(int i =0; i<n;i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Maximum :"+max+" "+"  Minimum :"+min);
    }
}
