package basics.maths;

public class ArmstrongNumber {

    public static void main(String[] args) {
        armStrong(153);
    }

    static void armStrong(int num){
        int count = 0;
        int tempNum = num;
        double ans = 0;

        int length = Integer.toString(num).length();        //To Find out length of the number

        while(tempNum > 0){
            int digit = tempNum %10;
            ans = Math.pow(digit,length) + ans;             //Logic of Armstrong number
            tempNum /= 10;
        }

        if(ans == num)
            System.out.println("The number is armstrong");
        else
            System.out.println("The number is not armstrong");

    }

}
