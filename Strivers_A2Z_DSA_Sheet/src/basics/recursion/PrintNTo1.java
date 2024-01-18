package basics.recursion;

public class PrintNTo1 {
    public static void main(String[] args) {
        printNTo1(5,1);
    }

    static void printNTo1(int i, int n){
        if(i<n){
            return;
        }
        System.out.print(i + " ");
        printNTo1(i-1, n);
    }
}
