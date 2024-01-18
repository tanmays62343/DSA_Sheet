package basics.maths;

public class CountDigits {
    public static void main(String[] args) {

        int num = 143 ;

        //To find out length of the number
        String numString = Integer.toString(num);
        System.out.println(numString.length());

        //OR (To Get Individual digits)

        while(num !=0){
            int Digit = num %10;
            System.out.print(Digit+ " ");
            num /= 10;
        }

    }



}
