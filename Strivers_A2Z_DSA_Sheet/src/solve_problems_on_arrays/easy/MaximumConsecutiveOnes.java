package solve_problems_on_arrays.easy;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int [] arr = { 1, 1, 0, 1, 1, 1 };
        maximumConsecutiveOnes(arr);
    }

    //Brute Force : O(n)
    static void maximumConsecutiveOnes(int [] arr){
        int count = 0;
        int maxOnes = 0;
        for(int i =0; i < arr.length; i++){
            if(arr[i] == 1){
                count++;
                if(count > maxOnes){
                    maxOnes = count;
                }
            }else{
                count = 0;
            }
        }
        System.out.println(maxOnes);
    }
}
