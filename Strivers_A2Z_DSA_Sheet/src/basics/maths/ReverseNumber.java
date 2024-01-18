package basics.maths;

//Program to reverse a number
public class ReverseNumber {
    public static void main(String[] args) {

        int num = 143;
        int rev = 0;

        while(num > 0){
            int digit = num% 10;
            rev = rev*10 + digit;   //(Main Logic)
            num /= 10;
        }
        System.out.println(rev);
    }
}
