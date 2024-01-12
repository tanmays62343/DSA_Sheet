package basics.pattern;

/*      A
        A B
        A B C
        A B C D
        A B C D E       */

public class pattern15 {

    public static void main(String[] args) {

        int n = 5;

        for(int i=1; i<=n; i++){
            char alphabet = 'A';
            for(int j=1; j<=i; j++){
                System.out.print(alphabet+ " ");
                alphabet++;
            }
            System.out.println();
        }


    }

}
