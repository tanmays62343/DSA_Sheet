package basics.recursion;

public class StringPalindrome {

    public static void main(String[] args) {
        System.out.println(checkPalindrome("YAAY",0));
    }

    //Recursive Solution
    static boolean checkPalindrome(String s,int i){
        if(i > s.length()/2){
            return true;
        }
        if(s.charAt(i)!= s.charAt(s.length()-i-1)){
            return false;
        }
        return checkPalindrome(s,i+1);
    }

    //Iterative Solution
    static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            char l = s.charAt(left), r = s.charAt(right);
            if (!Character.isLetterOrDigit(l))
                left++;
            else if (!Character.isLetterOrDigit(r))
                right--;
            else if (Character.toLowerCase(l) != Character.toLowerCase(r))
                return false;
            else {
                left++;
                right--;
            }
        }
        return true;
    }

}
