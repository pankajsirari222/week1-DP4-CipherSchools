public class class9 {
    public static boolean queenPlace(int [][] board,int row){
        if(row==board.length){
            printBoard(board);
            //System.out.println();
            System.out.println();
            return false;
        
        }
            for(int c=0;c<board.length;c++){
                if(isSafe(board,row,c)){
                    board[row][c]=1;
                    boolean can = queenPlace(board,row+1);
                    if(!can){
                        return true;
                    }
                    board[row][c]=0;
                }
            }
            return false;
        }
        private static void printBoard(int [][]board){
            for(int row=0;row<board.length;row++){
                for(int col=0;col<board[0].length;col++){
                    System.out.print(board[row][col]+" ");

                }
                System.out.println();
            }

        }

        private static boolean isSafe(int[][] board,int crow,int cind){
            for(int r=0;r<crow;r++){
                if(board[crow][cind]==1){
                    return false;
                }
            }
            int x = crow;
            int y = cind;
            while(x>=0 && y>=0){
                if(board[x][y]==1){
                    return false;
                }
                x--;
                y--;
            }
             x=crow;
             y=cind;
        
        while(x>=0 && y<board.length){
            if(board[x][y]==1){
                return false;
            }
            x--;
            y++;
            

        }
        return true;
    }
    public static void main(String[] args) {
        //int n=4;
        int [][] board=new int [4][4];
        queenPlace(board,0);
    }
}