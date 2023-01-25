// Search in a 2D sorted matrix
public class class3 {
    public static boolean searchInMatrix(int[][] arr, int target) {
        int n = arr.length;
        int m = arr[0].length;
        
        int low = 0;
        int high = m-1;

        while(low < n - 1 && high >= 0) {

            if(arr[low][high] == target) return true;
            if(arr[low][high] > target)
                high--;
            else low++; 
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[][] = { {1,3,5,7}, {10,11,16,20}, {23,30,34,60}};
        int target = 3;

        System.out.println(searchInMatrix(arr, target));
    }
}
