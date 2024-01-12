package basics.pattern;


 /*     *
        * *
        * * *
        * * * *
        * * * * *
        * * * *
        * * *
        * *
        *            */

public class pattern11 {
    public static void main(String[] args) {

        arrow(5);

    }

    static void arrow(int  n){

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n-1; i>0; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
