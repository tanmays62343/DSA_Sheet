package basics.maths;

public class PrintAllDivisors {

    public static void main(String[] args) {
        printDivisors(18);
        print_Divisors(18);
    }

    //Brute Force
    static void printDivisors(int a){
        for(int i=1; i<=a; i++){
            if(a%i == 0){
                System.out.print(i+ " ");
            }
        }
        System.out.println();
    }

    //Optimal Approach
    //In this approach we also print the quotient as it will also be the divisor
    static void print_Divisors(int a){
        for(int i=1; i<= (int)Math.sqrt(a); i++){
            if(a % i == 0){
                System.out.print(i + " ");
                if(i != a/2) System.out.print(a/i + " ");       //Case for the perfect square root
            }
        }
    }

}
