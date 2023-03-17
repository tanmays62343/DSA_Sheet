import java.util.Arrays;

public class Q5_Arr_MoveNegatives {

    public static void main(String[] args) {                //Sort all negative numbers
        int [] arr = {10,20,30,40,-50,-60,70,-80};
        sortNegatives(arr);

    }

    public static void sortNegatives(int [] arr){
        int count = 0;
        int n = arr.length;

        for(int i=0;i<n;i++){
            int temp = 0;

            if(arr[i]<0){
                temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
