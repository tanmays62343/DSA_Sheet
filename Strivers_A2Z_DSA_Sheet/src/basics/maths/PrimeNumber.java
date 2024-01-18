package basics.maths;

public class PrimeNumber {

    public static void main(String[] args) {
        primeNumber(13);
        prime_Number(13);
    }

    //Brute Force O(n)
    static void primeNumber(int num){
        int count = 0;
        for(int i =1; i<=num; i++){
            if(num%i == 0){
                count++;
            }
        }
        if(count > 2)
            System.out.println("The number is not a Prime Number");
        else
            System.out.println("The number is a Prime Number");
    }

    //Optimal Approach O(Log n)
    static void prime_Number(int num){
        int count = 0;
        for(int i =1; i<=Math.sqrt(num); i++){
            if(num%i == 0){
                count++;
            }
        }
        if(count > 2)
            System.out.println("The number is not a Prime Number");
        else
            System.out.println("The number is a Prime Number");
    }

}