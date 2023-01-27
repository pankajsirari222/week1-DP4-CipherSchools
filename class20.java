import java.util.Stack;
public class class20 {
    public static int maxArea(int [] arr){
        Stack<Integer> s = new Stack<>();
        int max_area=0;
        int i=0;
        while(i < arr.length){
            int current = arr[i];
            if(s.isEmpty() || current >=arr[s.peek()]){
                s.push(i);
                i++;
            }else{
                int previous = s.pop();
                int height = arr[previous];
                int width;
                if(s.isEmpty()){
                    width=i;
                }else{
                    width=i-s.peek()-1;
                }
                int area = height+width;
                max_area=Math.max(area,max_area);

            }
           
        }
        while(!s.empty()){
                int previous = s.pop();
                int height = arr[previous];
                int width;
                if(s.isEmpty()){
                    width=i;
                }else{
                    width=i-s.peek()-1;
                }
                int area = height+width;
                max_area=Math.max(area,max_area);
        }
        return max_area;

    }
    public static void main(String[] args) {
        int[] arr = {6,5};
        System.out.println(maxArea(arr));
    }
    
}