package solve_problems_on_arrays.medium;

import java.util.ArrayList;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {    {1, 2, 3},
                           {4, 5, 6},
                           {7, 8, 9} };
        spiralMatrix(arr);
    }

    static void spiralMatrix(int[][] arr) {

        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length, m = arr[0].length;
        int top = 0, left = 0, bottom = n - 1, right = m - 1;

        while (top <= bottom && left <= right) {
            //For moving left to right
            for (int i = left; i <= right; i++) {
                ans.add(arr[top][i]);
            }
            top++;
            //For moving top to bottom
            for (int i = top; i <= bottom; i++) {
                ans.add(arr[i][right]);
            }
            right--;
            //For moving right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(arr[bottom][i]);
                }
                bottom--;
            }
            //For moving bottom to top
            if(left <= right){
                for(int i = bottom; i>= top; i--){
                    ans.add(arr[i][left]);
                }
                left++;
            }
        }
        System.out.println(ans);
    }

}
