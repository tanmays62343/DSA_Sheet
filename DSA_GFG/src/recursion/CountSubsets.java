package recursion;

public class CountSubsets {
    public static void main(String[] args) {
        int n = 3;
        int[] arr = {10, 20, 15};
        int sum = 25;

        System.out.println(countSubsets(arr,n,sum));

    }

    static int countSubsets(int[] arr, int n, int sum){
        if(n == 0)
            return sum == 0? 1 : 0;

        return countSubsets(arr,n-1,sum) + countSubsets(arr,n-1,sum - arr[n-1]);
    }
}
