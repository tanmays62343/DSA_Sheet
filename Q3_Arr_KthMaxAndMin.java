import java.util.Arrays;

public class Q3_Arr_KthMaxAndMin {           //Kth smallest element
    public static void main(String[] args) {

        int [] arr = {10,20,30,40,50,60,70};
        try {
            System.out.println(KthSmallest(arr, 3));
        }
        catch (Exception e){
            System.out.println("Invalid input");
        }
    }

    public static int KthSmallest(int [] arr,int k){
        Arrays.sort(arr);

        return arr[k-1];
    }
}
