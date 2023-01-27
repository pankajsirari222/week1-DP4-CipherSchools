public class class5 {
    public static int getElement(int []b){

        int [] left = new int[b.length];
        int [] right = new int[b.length];
        left[0]=b[0];
        int w=0;

        for(int i=1;i<left.length;i++){
            left[i]=Math.max(left[i-1],b[i]);
        }

        right[b.length-1]=b[b.length-1];

        for(int r=b.length-2;r>=0;r--){
            right[r]=Math.max(left[r+1],b[r]);
        }

        for(int c=0;c<b.length;c++){
            w=w+Math.min(right[c],right[c]-b[c]);
        }
        
        return w;
    }
    public static void main(String[] args) {
        int a[]={5,0,5};
        System.out.println(getElement(a));
    }
    
}