package recursion;

public class GeneratingSubsets {
    public static void main(String[] args) {
        subsets("ABC","",0);
    }

    //Method for Generating all the subsets of aa string (it will include empty String)
    static void subsets(String s,String curr,int i){
        if(i==s.length()) {
            System.out.print(curr+" ");
            return;
        }
        subsets(s,curr,i+1);        //Do not include next
        subsets(s,curr+s.charAt(i),i+1);        //Include Next
    }

}
/*The method is to traverse through the String then include the next Character one time and do not include
it one time like this we will generate all the subsets of the String.*/
