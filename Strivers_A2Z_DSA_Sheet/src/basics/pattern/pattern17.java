package basics.pattern;

/*      E
        D E
        C D E
        B C D E
        A B C D E       */

public class pattern17 {

    public static void main(String[] args) {

        int n = 5;

        for(int i=0; i<n; i++){
            for(char ch =(char)(int)('A'+n-1-i);ch<=(char)(int)('A'+n-1);ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }

    }

}
