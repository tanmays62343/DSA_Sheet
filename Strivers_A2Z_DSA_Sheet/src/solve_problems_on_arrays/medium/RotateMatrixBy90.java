package solve_problems_on_arrays.medium;

public class RotateMatrixBy90 {
    public static void main(String[] args) {
        int [][] arr = { {1, 2, 3},
                         {4, 5, 6},
                         {7, 8, 9} };

        //int [][] rotated = rotateMatrixBy90(arr);
        rotateMatrixBy90_Optimal(arr);
        for(int[] row : arr){
            for(int element : row){
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }

    //Brute Force : O(n2)
    //Space Complexity : O(n2)
    static int[][] rotateMatrixBy90(int [][] arr){
        int n = arr.length;
        int [][] rotated = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j=0; j<n; j++){
                rotated[j][n-i-1] = arr[i][j];
            }
        }
        return rotated;
    }

    //Optimal Solution : O(n2 + n2)
    //Space Complexity : O(1)
    static void rotateMatrixBy90_Optimal(int [][] arr){
        //Transpose the matrix
        for(int i =0; i< arr.length; i++){
            for(int j =i; j<arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //Reverse the rows of matrix
        for(int i=0; i<arr.length; i++){
            for(int j =0; j<arr.length/2; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr.length-1-j];
                arr[i][arr.length-1-j] = temp;
            }
        }
    }

}
