package recursion;

/*This problem says that there are n person in a circle and
after the Kth iteration we have to kill one person tell the position of last survivor*/

public class JosephusProblem {
    public static void main(String[] args) {
        System.out.println(josephus(3,3));
    }

    static int josephus(int n,int k){
        if(n==1)
            return 0;
        else
            return (josephus(n-1,k)+k)%n;       //Formula for josephus
    }

}
