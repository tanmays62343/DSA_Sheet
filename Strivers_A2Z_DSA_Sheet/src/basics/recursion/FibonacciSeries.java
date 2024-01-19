package basics.recursion;

import java.util.Arrays;

public class FibonacciSeries {
    public static void main(String[] args) {
        fibonacci_Iterative(10);
    }

    //Recursive Solution (Gives only the last term)
    static int fibonacci(int N){
        if(N <= 1){
            return N;
        }
        // Problem broken down into 2 functional calls
        // and their results combined and returned.
        int last = fibonacci(N-1);
        int slast = fibonacci(N-2);
        return last + slast;
    }

    //Iterative Solution (Gives All the terms)
    static void fibonacci_Iterative(int n){
        if(n==0){
            System.out.println(0);
        }
        long [] fibonacci = new long[n+1];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for(int i=2; i<=n; i++){
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        System.out.println(Arrays.toString(fibonacci));
    }

}
