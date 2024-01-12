package recursion;

public class Print_nTo1 {
    public static void main(String[] args) {
        printNTo1(10);
    }
    static void printNTo1(int n){
        if(n == 0)
            return;
        System.out.print(n+ " ");
        printNTo1(n-1);
    }
}
