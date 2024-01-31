package solve_problems_on_arrays.medium;

public class MostAppearedElement {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        mostAppearedElement(arr);
    }

    //Brute Force : O(n2)
    //This is solution for most appeared element in an array
    static void mostAppearedElement(int[] arr){
        int maxCount = 0;
        int majorityElement = -1;
        for(int i =0; i < arr.length; i++){
            int num = arr[i];
            int count = 0;
            for(int j = 0; j< arr.length; j++){
                if(arr[j] == num){
                    count++;
                    if(count > maxCount){
                        maxCount = count;
                        majorityElement = arr[j];
                    }
                }
            }
        }
        System.out.println(majorityElement);
    }

}
