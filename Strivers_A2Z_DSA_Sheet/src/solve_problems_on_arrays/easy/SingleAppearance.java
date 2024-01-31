package solve_problems_on_arrays.easy;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.HashMap;
import java.util.Map;

public class SingleAppearance {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        //singleAppearance(arr);
        //singleAppearance_Better1(arr);
        //singleAppearance_Better2(arr);
        singleAppearance_Optimal(arr);
    }

    //Brute Force O(n2)
    static void singleAppearance(int [] arr){
        for(int i =0; i<arr.length; i++){
            int num = arr[i];
            int count = 0;
            for(int j =0; j< arr.length; j++){
                if(arr[j] == num){
                    count++;
                }
            }
            if(count == 1)
                System.out.println(num);
        }
    }

    //Better Approach 1 : O(n) + O(n) + O(n)
    //Using Hash Array  Space Complexity : O(maxElement+1)
    static void singleAppearance_Better1(int [] arr){
        int maxElement = Integer.MIN_VALUE;
        int n = arr.length;
        //Find max element to find length of hash array
        for(int i = 0; i<n; i++){
            maxElement = Math.max(maxElement,arr[i]);
        }
        int [] hash = new int[maxElement+1];
        for(int i =0; i< n; i++){
            hash[arr[i]] += 1;      //filling the hash array increment times appeared ({0,2,2,0,1,0,0})
        }
        for(int i = 0; i<n; i++){           //Not suitable for bigger input or -ve inputs
            if(hash[arr[i]] == 1){
                System.out.println(arr[i]);
                break;
            }
        }
    }

    //Better Approach 2 : O(n) + O(m)
    static void singleAppearance_Better2(int [] arr){
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            //Hashing the given array elements
            int value = map.getOrDefault(arr[i],0);
            map.put(arr[i],value+1);
        }
        //Now find the element with single entry
        map.forEach((key,value) -> {
            if(value == 1){
                System.out.println(key);
            }
        });
    }

    //Optimal solution : O(n)
    //XOR of two same numbers is always 0 i.e. a ^ a = 0.
    //XOR of a number with 0 will result in the number itself i.e. 0 ^ a = a.
    static void singleAppearance_Optimal(int [] arr){
        int n = arr.length;
        int xor = 0;
        for(int i =0; i<n; i++){
            xor = xor ^ arr[i];
        }
        System.out.println(xor);
    }



}
