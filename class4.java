//Minimum No. of Platforms
/*
 *  1.To find the min no. of platforms, first sort both the arrival and departure arrays.
 *  2.Now, if arr[i] <= dep[i] , increase the number of platform by 1 and store in max.
 *  3. If, dep time is less than arr time, count--.
 *  4. At last, return the max count at a time. 
 */
import java.util.*;
public class class4 {
    static int minPlatforms(int arr[], int dep[], int n)
    {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i = 0, j = 0;
        int count = 0, num = -1;
        while(i < n && j < n) {
            if(arr[i] <= dep[j]) {
                i++;
                count++;
            }
            else {
                count--;
                j++;
            }
            num = Math.max(num, count);
        }
        return num;
        
    }
    public static void main(String[] args) {
        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
        int n = arr.length;

        System.out.println(minPlatforms(arr, dep, n));

    }
}
