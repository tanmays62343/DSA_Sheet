package recursion;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        System.out.println(sumOfNaturalNum(5));
    }

    static int sumOfNaturalNum(int n){
        if(n == 0)
            return 0;
        return n+sumOfNaturalNum(n-1);
    }
}
