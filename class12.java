import java.util.*;
//Generate Subsets
public class class12 {
    public static void generateSubsets(int[] arr, ArrayList<Integer> ans, int index){
        if(index == arr.length){
            printArrayList(ans);
            return;
        }
        ans.add(arr[index]);
        generateSubsets(arr, ans, index + 1);
        ans.remove(ans.size() - 1);
        generateSubsets(arr, ans, index + 1);
    }

    public static void printArrayList(ArrayList<Integer> ans){
        for(int i = 0; i < ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        ArrayList<Integer> ans = new ArrayList<>();
        generateSubsets(arr, ans, 0);
    }
    
}