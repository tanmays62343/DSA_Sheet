package basics.recursion;

public class SumOfNNumbers {
    public static void main(String[] args) {
        printSum(5,0);
        System.out.println(printSum_Functional(5));
    }

    //Parameterized way
    static void printSum(int n,int ans){
        if(n < 1){
            System.out.println(ans);
            return;
        }
        ans += n;
        printSum(n-1,ans);
    }

    //Functional Way
    static int printSum_Functional(int n){
        if(n==0){
            return 0;
        }
        return n + printSum_Functional(n-1);
    }

}
