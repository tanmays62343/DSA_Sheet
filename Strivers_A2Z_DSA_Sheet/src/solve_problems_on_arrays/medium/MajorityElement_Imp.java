package solve_problems_on_arrays.medium;
import java.util.HashMap;

//!Moore's Voting Algorithm
public class MajorityElement_Imp {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        //majorityElement(arr);
        majorityElement_Better(arr);
    }

    //Brute Force : O(n2)
    static void majorityElement(int [] arr){
        int majorityElement = -1;
        for(int i =0; i < arr.length; i++){
            int count = 0;
            for(int j = 0; j<arr.length; j++){
                if(arr[j] == arr[i]){
                    count++;
                }
            }
            //Element is said to be in majority if it appears more than half of the length of Array
            if(count > arr.length/2){
                majorityElement = arr[i];
            }
        }
        System.out.println("Majority element is : "+majorityElement);
    }

    //Better Approach : O(n2)
    //Improves in best case
    static void majorityElement_Better(int [] arr){
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i =0; i< arr.length; i++){
            int value = map.getOrDefault(arr[i],0);
            map.put(arr[i],value+1);
        }
        //Iterating Map
        map.forEach((key,value) -> {
            if(value > arr.length/2){
                System.out.println("The majority element is : "+key);
            }
        });
    }

    //Optimal solution : O(n)+O(n)
    //!Moore's Voting Algorithm
    //It is divided into two parts selecting a candidate and Verifying the candidate
    static void majorityElement_Optimal(int[] arr){
        int count = 0;
        int element = 0;
        //Applying the moore's algo and selecting most potential candidate
        for(int i=0; i< arr.length; i++){
            if(count == 0){
                count = 1;
                element = arr[i];
            } else if(element == arr[i]){
                count++;
            } else {
                count--;
            }
        }
        //Verifying if the selected candidate is in majority or not
        int counter = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == element){
                counter++;
            }
        }
        if(counter > arr.length/2){
            System.out.println("Majority Element is :"+element);
        } else{
            System.out.println("Majority Element Not Found");
        }

    }

}
