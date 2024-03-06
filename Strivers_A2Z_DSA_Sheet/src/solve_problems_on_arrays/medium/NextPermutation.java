package solve_problems_on_arrays.medium;
import java.util.*;

public class NextPermutation {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(new Integer[] {2, 1, 5, 4, 3, 0, 0});
        nextPermutation(arr);
    }

    //Brute Force O(n! * n)
    //-Generate All the permutations in sorted order
    //-Do a linear Search
    //-Find the next permutation

    //Optimal solution : O(3n)
    static void nextPermutation(List<Integer> arr){
        //Step 1 : Find the Break point Form where we can smaller the Array
        int index  = -1;  //Break Point
        for(int i = arr.size()-2; i >= 0; i--){  //Finding the Break Point
            if(arr.get(i) < arr.get(i+1)){
                index = i;
                break;
            }
        }
        if(index == -1){
            Collections.reverse(arr);
            System.out.println(arr);
        }
        //Step 2 : Find the next Greater Element and swap it with arr[index]
        for(int i = arr.size()-1; i > index; i--){
            if(arr.get(i) > arr.get(index)){
                int temp = arr.get(i);
                arr.set(i,arr.get(index));
                arr.set(index,temp);
                break;
            }
        }
        //Step 3 : Reverse the Right Half
        List<Integer> subList = arr.subList(index+1,arr.size()); //Will also affect the main array
        Collections.reverse(subList);
        System.out.println(arr);
    }
}
