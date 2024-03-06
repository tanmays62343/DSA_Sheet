package solve_problems_on_arrays.medium;

public class SetMatrixZero {
    public static void main(String[] args) {
        int [][] arr = {{1,1,1},
                        {1,0,1},
                        {1,1,1}};
        //setMatrixZero(arr);
        setZeroMatrix_Better(arr);
        for(int [] row : arr){
            for(int element : row){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    //Brute Force : O((n*m)*(n+m)) + O(n*m)
    static void setMatrixZero(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    markRow(arr, i);
                    markColum(arr, j);
                }
            }
        }
        //Mark all -1s as Zeros
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == -1){
                    arr[i][j] = 0;
                }
            }
        }
    }

    //Better Approach : O(2(n*m)
    static void setZeroMatrix_Better(int [][] arr){
        int n = arr.length;
        int m = arr[0].length;
        int[] row = new int[n];
        int[] colum = new int[m];
        //Traverse the Matrix
        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                if(arr[i][j] == 0){
                    row[i] = 1;
                    colum[j] = 1;
                }
            }
        }
        //Mark the rows and column as zero
        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                if(row[i]==1 || colum[j] == 1){
                    arr[i][j] = 0;
                }
            }
        }
    }

    //Optimal Approach : O()
    static void setZeroMatrix_Optimal(int [][] arr){
        int n = arr.length;
        int m = arr[0].length;




    }

    //Helper Functions for Brute Force
    static void markRow(int[][] arr, int i) {
        for (int j = 0; j < arr[i].length; j++) {
            if (arr[i][j] != 0) {
                arr[i][j] = -1;
            }
        }
    }

    static void markColum(int[][] arr, int j) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][j] != 0) {
                arr[i][j] = -1;
            }
        }
    }


}
