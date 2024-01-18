package basics.maths;

public class GCDorHCF {

    public static void main(String[] args) {
        System.out.println(GCD(6, 9));
        System.out.println(gcd(5,15));
        System.out.println(GCD_HCF(5, 15));
    }

    //Brute Force
    static int GCD(int a, int b) {
        int ans = -1;

        for (int i = 1; i < Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                ans = i;
            }
        }
        return ans;
    }

    //Better Brute Force
    static int gcd(int a,int b){
        int ans = -1;

        for(int i = Math.min(a,b); i>0; i--){       //we start from back to find the ans quicker
            if(a%i == 0 && b%i==0) {
                ans = i;
                break;      //We break the loop as soon as we find answer
            }
        }
        return ans;
    }

    //Optimal Approach  (Euclidean Theorem)
    static int GCD_HCF(int a, int b){
        while(a > 0 && b > 0){
            if(a > b) a = a % b;
            else b = b % a;
        }
        if(a == 0)
            return b;
        else
            return a;
    }

}
