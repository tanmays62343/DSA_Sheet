import java.util.Arrays;

public class Q7_Arr_CylindricallyRotate {
    public static void main(String[] args) {            //Cylindrically rotate an array by one
        int [] arr = {1,2,3,4,5};
        CylindricalRotate(arr);
    }
    public static void CylindricalRotate(int [] arr){
        int n = arr.length;
        int last = arr[n-1];
        for(int i=n-1; i>0; i--)
            arr[i] = arr[i-1];
        arr[0] = last;
        System.out.println(Arrays.toString(arr));
    }
}
