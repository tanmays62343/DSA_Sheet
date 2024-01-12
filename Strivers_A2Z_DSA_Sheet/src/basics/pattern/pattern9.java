package basics.pattern;


/*        *
        * * *
      * * * * *
    * * * * * * *
  * * * * * * * * *
  * * * * * * * * *
    * * * * * * *
      * * * * *
        * * *
          *               */

public class pattern9 {

    public static void main(String[] args) {
        pyramid(5);
        invertedPyramid(5);
    }

    static void pyramid(int n){

        for(int i =0; i<n; i++){
            for(int j=0 ; j<n-i-1; j++){
                System.out.print("  ");
            }
            for(int j=0 ; j<2*i+1; j++){
                System.out.print("* ");
            }
            for(int j=0 ; j<n-i-1; j++){
                System.out.print("  ");
            }
            System.out.println();
        }

    }

    static void invertedPyramid(int n){

        for(int i =n-1; i>=0; i--){
            //for Space
            for(int j=0 ; j<n-i-1; j++){
                System.out.print("  ");
            }
            for(int j=0 ; j<2*i+1; j++){
                System.out.print("* ");
            }
            for(int j=0 ; j<n-i-1; j++){
                System.out.print("  ");
            }
            System.out.println();
        }

    }

}
