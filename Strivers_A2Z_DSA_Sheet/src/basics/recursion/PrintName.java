package basics.recursion;

public class PrintName {

    public static void main(String[] args) {
        print(1,5);
    }

    static void print(int i, int n){
        if(i>n){
            return;
        }
        System.out.println("Name :");
        print(i+1,n);
    }

}
