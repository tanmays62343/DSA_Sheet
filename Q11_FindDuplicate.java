public class Q11_FindDuplicate {
    public static void main(String[] args) {
        int [] arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
    public static int findDuplicate(int [] arr){
        int count=0;
        int repeatedNum=0;
        int n = arr.length;
        for(int i=0; i<n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j])
                    return arr[i];
            }
        }
        return n;
    }
}

