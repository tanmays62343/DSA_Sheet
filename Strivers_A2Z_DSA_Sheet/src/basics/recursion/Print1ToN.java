package basics.recursion;

public class Print1ToN {
    public static void main(String[] args) {
        print1ToN(1,5);
    }

    static void print1ToN(int i, int n){
        if(i>n){
            return;
        }
        System.out.print(i + " ");
        print1ToN(i+1, n);
    }

}
