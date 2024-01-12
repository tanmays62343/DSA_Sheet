package basics.pattern;


/*        A
        A B A
      A B C B A
    A B C D C B A    */

public class pattern16 {
    public static void main(String[] args) {
        pyramid(5);
    }

    static void pyramid(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print("  ");
            }
            char ch = 'A';
            int breakpoint = (2*i+1)/2;
            for(int j=0; j<2*i+1; j++){
                System.out.print(ch + " ");
                if(j<breakpoint) ch++;
                else ch--;
            }
            for(int j=0; j<n-i-1; j++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }

}
