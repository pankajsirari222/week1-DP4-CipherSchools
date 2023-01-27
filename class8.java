public class class8 {
    public static int findMax(int [] arr , int index){
        if(index<0){
            return Integer.MIN_VALUE;
        }
        int t = findMax(arr,index-1);
        int m = Math.max(t,arr[index]);
        return m;
    }
    public static void helper(int left,int right,String output){
        if(left>right){
            return;
        }
        if(left==0 && right==0) {
            System.out.println(output);
            return;
        }
        if(left>0){
            helper(left-1,right,output+"(");

        }
        if(right>0){
            helper(left,right-1,output+")");

        }
        
        
    }
    public static void generateParenthisis(int number){
        helper(number,number,"");

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};

        System.out.println(findMax(arr,arr.length-1));
        generateParenthisis(5);
    }
}