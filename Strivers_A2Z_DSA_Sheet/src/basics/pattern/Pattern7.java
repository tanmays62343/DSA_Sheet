package basics.pattern;

/*          *
          * * *
        * * * * *
       * * * * * * *
     * * * * * * * * *     */

public class Pattern7 {

    public static void main(String[] args) {

        int n = 5;
        for(int i =0; i<n; i++){
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
