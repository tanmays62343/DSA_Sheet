package basics.pattern;


/*      * * * * * * * * *
          * * * * * * *
            * * * * *
              * * *
                *        */

public class Pattern8 {

    public static void main(String[] args) {

        int n = 5;
        for(int i =n-1; i>=0; i--){
            //for Space
            for(int j=0 ; j<n-i-1; j++){
                System.out.print("  ");
            }
            //for Star
            for(int j=0 ; j<2*i+1; j++){
                System.out.print("* ");
            }
            //for Space
            for(int j=0 ; j<n-i-1; j++){
                System.out.print("  ");
            }
            System.out.println();
        }

    }

}
