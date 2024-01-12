package recursion;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome("YAY",0,2));
    }

    //Function to check weather the string is palindrome or not
    static boolean palindrome(String s,int start,int end){
        if(start>=end)
            return true;
        return(s.charAt(start) == s.charAt(end)) && palindrome(s,start+1,end-1);
    }

}
