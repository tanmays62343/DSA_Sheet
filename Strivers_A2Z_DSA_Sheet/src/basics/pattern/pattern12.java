package basics.pattern;

/*      1
        01
        101
        0101
        10101     */

public class pattern12 {
    public static void main(String[] args) {
        binaryTriangle(5);
    }

    static void binaryTriangle(int n){

        int start = 1;
        for(int i=0; i<n; i++){
            if(i%2 == 0) start = 1;
            else start =0;
            for(int j=0; j<=i; j++){
                    System.out.print(start);
                    start = 1-start;
            }
            System.out.println();
        }

    }

}
