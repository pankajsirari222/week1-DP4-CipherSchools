public class class2 {
/*  Return K smallest elements in the array according to their indexes.
    1. First Assume first K elements as smallest
    2. Now start iterating from (k+1) element i.e. curr = arr[k]
        2.1 Find max of first k elements along with index
        2.2 if(curr  < max) shift pos to left by 1 till we reach max pos.
    
*/
    public static void kElements(int[] arr, int k) {
        int n = arr.length;
        for(int i = k; i < n; i++) {
            int maxIndex = k-1; //Every time we will consider arr[k-1] as max element and can then check the real max element by traversing from n-2 to 0 index
            int curr = arr[i];

            for(int j = k-2; j >= 0; j--) {
                if(arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            if(curr < arr[maxIndex]) {
                while(maxIndex < k-1) {
                    arr[maxIndex] = arr[maxIndex + 1];
                    maxIndex++;
                }
                arr[k-1] = curr;
            }
        }

        for(int i = 0; i < k; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {50,25,100,200,30};
        int k = 2;
        kElements(arr, k);
    }
}
