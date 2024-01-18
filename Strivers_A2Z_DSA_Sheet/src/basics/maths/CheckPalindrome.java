package basics.maths;

public class CheckPalindrome {
    public static void main(String[] args) {

        int num = 143;
        int tempNum = num;     //Because the value of num will also change if we directly perform operation on it
        int rev = 0;

        while(tempNum > 0){
            int digit = tempNum % 10;
            rev = rev*10 + digit;
            tempNum /= 10;
        }

        if(rev == num)
            System.out.println("The Number is a palindrome");
        else
            System.out.println("The Number is not a palindrome");
    }
}
