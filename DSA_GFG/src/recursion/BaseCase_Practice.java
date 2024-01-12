package recursion;

public class BaseCase_Practice {
    public static void main(String[] args) {
        System.out.println(fact(5));

    }




    //Function for factorial
    static int fact(int n){
        if(n == 0)
            return 1;
        return n * fact(n-1);
    }

    //fibonacci numbers
    static int fibonacci(int n){
        if(n == 0)          //or we can write if(n<=1) return n; (in place of both ifs)
            return 0;
        if(n == 1)
            return 1;

        return fibonacci(n-1)+fibonacci(n-2);       //Sum of previous two numbers
    }

}

