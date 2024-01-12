package recursion;

public class Print_1ToN {
    public static void main(String[] args) {
        print1ToN(8);
        System.out.println();
        print1ToN(8,1);
    }

    static void print1ToN(int n){
        if(n == 0)
            return;
        print1ToN(n-1);
        System.out.print(n+" ");
    }

    //Converting it into tail Recursive
    static void print1ToN(int n,int base){
        if(base > n)
            return;
        System.out.print(base+" ");
        print1ToN(n,base+1);
    }
}
