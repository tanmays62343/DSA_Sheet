package recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        towerOfHanoi(3,'A','B','C');
    }

    //Tower of Hanoi problem (Number of Disks, Source, Auxiliary, Destination)
    static void towerOfHanoi(int n,char A,char B,char C){
        if(n == 1){
            System.out.println("Move 1 From "+A+" To "+C);
            return;
        }
        towerOfHanoi(n-1,A,C,B);
        System.out.println("Move "+n+" From "+A+" To "+C);
        towerOfHanoi(n-1,B,A,C);
    }

    // T(n) = 2T(n-1)+1

}
