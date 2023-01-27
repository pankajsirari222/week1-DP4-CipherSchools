// Maximum Number after K Swaps
// We have used backtracking here.
public class class10 {
    static String max = "0";
    public static String swap(String s, int i, int j) {
        char ith = s.charAt(i);
        char jth = s.charAt(j);

        String left = s.substring(0, i);
        String mid = s.substring(i+1, j);
        String right = s.substring(j+1);

        return left + jth + mid + ith + right;
    }
    public static void findMaximum(String s, int k) {

        if(Integer.parseInt(s) > Integer.parseInt(max))
            max = s;
        if(k == 0)  
            return;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(s.charAt(i) < s.charAt(j)) {
                    s = swap(s, i, j);  //Swapping to get max element
                    findMaximum(s, k-1);    //Recursive Call
                    s = swap(s, i, j);  //Backtracking
                }
            }
        }
    }
    public static void main(String[] args) {
        String s = "245";
        int k = 1;

        findMaximum(s, k);
        System.out.println(max);
    }
}
