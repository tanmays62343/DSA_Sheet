package solve_problems_on_arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RearrangeArrayBySigns {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, -4, -5};
        int[] arr2 = {1, 2, -4, -5, 3, 4};
        //rearrangeArrayBySign(arr);
        //rearrangeArrayBySign_Optimal1(arr);
        rearrangeArrayBySign_Optimal2(arr2);
    }


    //Brute Force : O(n + n/2)
    static void rearrangeArrayBySign(int[] arr){
        ArrayList<Integer> positives = new ArrayList<>();
        ArrayList<Integer> negatives = new ArrayList<>();
        for(int i =0; i<arr.length; i++){
            if(arr[i] > 0){
                positives.add(arr[i]);
            } else {
                negatives.add(arr[i]);
            }
        }
        for(int i = 0; i<arr.length/2; i++){
            arr[2*i] = positives.get(i);
            arr[2*i+1] = negatives.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }

    //Optimal solution : O(n)
    //Space complexity : O(n)
    //It works if half are +ve and half are -ve.
    static void rearrangeArrayBySign_Optimal1(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(arr.length,0));
        int posIndex = 0;
        int negIndex = 1;
        for(int i =0; i< arr.length; i++){
            if(arr[i] < 0){
                ans.set(negIndex, arr[i]);
                negIndex += 2;
            }
            else {
                ans.set(posIndex,arr[i]);
                posIndex += 2;
            }
        }
        System.out.println(ans);
    }

    //Variety 2 solution O(2n)
    //Works for unequal +ve and -ve
    static void rearrangeArrayBySign_Optimal2(int[] arr){
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        //Extract +ve and -ve from given array
        for(int i =0; i< arr.length; i++){
            if(arr[i]>0){
                pos.add(arr[i]);
            } else{
                neg.add(arr[i]);
            }
        }
        //If +ve are More than -ve
        if(pos.size() > neg.size()){
            for(int i =0; i< neg.size(); i++){
                arr[2*i] = pos.get(i);
                arr[2*i+1] = neg.get(i);
            }
            //Fill the remaining places
            int index = neg.size()*2;
            for(int i = neg.size(); i<pos.size(); i++){
                arr[index] = pos.get(i);
                index++;
            }
        }
        //If -ve are More than +ve
        else {
            for(int i =0; i<pos.size(); i++){
                arr[2*i] = pos.get(i);
                arr[2*i+1] = neg.get(i);
            }
            //Fill the remaining places
            int index = pos.size()*2;
            for(int i = pos.size(); i<neg.size(); i++){
                arr[index] = neg.get(i);
                index++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
