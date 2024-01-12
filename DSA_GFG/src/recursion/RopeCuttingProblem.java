package recursion;

public class RopeCuttingProblem {

    //Given a Piece of rope cut it maximum times in any of the three given lengths (can select multiple length)

    public static void main(String[] args) {
        int n=14, a=3, b=7, c=5;
        System.out.println(cutRope(n,a,b,c));
    }
    static int cutRope(int n, int a, int b, int c){
        if(n == 0)
            return 0;

        if(n < 0)
            return -1;

        int res = Math.max(cutRope(n-a,a,b,c),
                Math.max(cutRope(n-b,a,b,c),cutRope(n-c,a,b,c)));

        if(res == -1)
            return -1;

        return res+1;
    }
}
