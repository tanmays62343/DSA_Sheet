package solve_problems_on_arrays.medium;
import java.util.Arrays;
import java.util.HashSet;
public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {100, 200, 1, 2, 3, 4};
        //longestConsecutiveSequence(arr);
        //longestConsecutiveSequence_Optimal1(arr);
        longestConsecutiveSequence_Optimal2(arr);
    }

    //Brute Force : O(n2)
    //Check if the next Element is present in the Array or Not
    static void longestConsecutiveSequence(int[] arr) {
        int maxSequenceLength = 0;
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == element) {
                    count++;
                    element++;
                }
            }
            maxSequenceLength = Math.max(maxSequenceLength, count);
        }
        System.out.println(maxSequenceLength);
    }

    //Optimal solution : O(n log n)
    static void longestConsecutiveSequence_Optimal1(int[] arr) {
        int n = arr.length;
        if (n == 0) return;
        Arrays.sort(arr);
        int lastSmaller = Integer.MIN_VALUE;
        int count = 0;
        int maxSequenceLength = 1;
        //Find the Longest Sequence
        for (int i = 0; i < n; i++) {
            if (arr[i] - 1 == lastSmaller) {
                count++;
                lastSmaller = arr[i];
            } else if (arr[i] != lastSmaller) {
                count = 1;
                lastSmaller = arr[i];
            }
            maxSequenceLength = Math.max(maxSequenceLength, count);
        }
        System.out.println(maxSequenceLength);
    }

    //Optimal Solution : O(2n)
    static void longestConsecutiveSequence_Optimal2(int[] arr) {
        int n = arr.length;
        if (n == 0) return;
        int maxSequenceLength = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        for (int element : set) {
            if (!set.contains(element - 1)) {
                int count = 1;
                int current = element;
                while (set.contains(current + 1)) {
                    current += 1;
                    count++;
                }
                maxSequenceLength = Math.max(maxSequenceLength, count);
            }
        }
        System.out.println(maxSequenceLength);
    }
}
