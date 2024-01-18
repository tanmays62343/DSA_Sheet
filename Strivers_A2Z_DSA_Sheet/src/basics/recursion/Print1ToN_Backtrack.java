package basics.recursion;

public class Print1ToN_Backtrack {
    public static void main(String[] args) {
        print1ToN_Backtrack(10,10);
    }

    static void print1ToN_Backtrack(int i, int n){
        if(i < 1){
            return;
        }
        print1ToN_Backtrack(i-1,n);
        System.out.print(i + " ");
    }

}
