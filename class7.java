public class class7 {
    public static void printDecode(String number,String output){
        if(number.length()==0){
            System.out.println(output);
            return;
        }
        String f1= number.substring(0,1);
        int f = Integer.parseInt(f1);
        if(f!=0){
            char character = (char)('a'+f-1);
            printDecode(number.substring(1),output+character);
            
        }
        if(number.length()<=1){
            return;
        }
        int f2 = Integer.parseInt(number.substring(0,2));
        if(f2<=26){
            if(f2<=0){
                printDecode(number.substring(2),output+"");
                return;
            }
            char character = (char)('a'+f-1);
            printDecode(number.substring(2),output+character);
        }
    }
    public static void main(String[] args) {
        printDecode("200","");
    }
}
