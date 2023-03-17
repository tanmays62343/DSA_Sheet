import java.util.*;

public class Q6_Arr_Union {

    public static void main(String[] args) {
        int [] arr1 = {10,20,30,40,50};
        int [] arr2 = {10,20,70};
        System.out.println(doUnion(arr1, 5 , arr2, 3));
    }

    public static int doUnion(int [] arr1 , int n, int [] arr2, int m){
        HashSet<Integer>st = new HashSet<>();
        for(int i=0;i<n;i++){
            st.add(arr1[i]);
        }
        for(int i=0; i<m; i++){
            st.add(arr2[i]);
        }
        return st.size();
    }

    /*public static int unionArr(int [] arr1 , int [] arr2){
        int n1 = arr1.length;
        int n2= arr2.length;
        int count=0;

        for(int i=0; i<Integer.max(n1,n2); i++){
            if(i<Integer.min(n1,n2)) {
                if (arr1[i] == arr2[i]) {
                    count++;
                } else {
                    count += 2;
                }
            }
            else{
                count++;
            }
        }
        System.out.println(count);
        return count;
    }*/

}
