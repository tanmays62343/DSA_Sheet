import java.util.Arrays;

public class Q1_Arr {     //Reverse An Array
    public static void main(String[] args) {

        int [] arr = {10,20,30,40,50};
        ArrRev(arr);
    }
    public static void ArrRev(int [] arr){
        int n = arr.length;
        int j = n-1;
        int [] NewArr = new int[n];
        for(int i=0; i<n;i++){
            NewArr[j] = arr[i];
            j -= 1;
        }
        System.out.println(Arrays.toString(NewArr));
    }
}
