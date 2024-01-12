package recursion;

import java.sql.SQLOutput;
import java.util.Scanner;

public class exercise1 {

    static Scanner sc  = new Scanner(System.in);

    public static void main(String[] args) {
        int n ;
        System.out.println("Enter a number");
        n = sc.nextInt();
        toBinary(n);
        System.out.println();
        System.out.println(log(n));
    }

    //This function converts the number to Binary
    static void toBinary(int n){
        if(n==0)
            return;
        toBinary(n/2);
        System.out.print(n%2);
    }

    //This function returns log base 2 of the number
    static int log(int n){
        if(n==1)
            return 0;
        else
            return 1 + log(n/2);
    }

}
