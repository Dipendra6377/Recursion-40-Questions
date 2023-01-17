// 1. Naive approack

class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        List<List<String>> res = new ArrayList<List<String>>();
        Putqueens(0,board,res);
        return res;
    }

    public void Putqueens(int col,char[][] board,List<List<String>> res){
        if(board.length==col){
            res.add(makeBoard(board));
            return;
        }

        for(int row=0;row<board.length;row++){
            if(IsQueenAttack(board,row,col)){
                board[row][col]='Q';
                Putqueens(col+1,board,res);
                board[row][col]='.';
            }
        }
    }
    public boolean IsQueenAttack(char[][] board,int row,int col){
        int duprow=row;
        int dupcol=col;
            
        // check upward diagonal if there is queen or not
        while(row>=0 && col>=0){
            if(board[row][col]=='Q'){
                    return false;
                }
                row--;
                col--;
            }
            //check if left side column has queen or not 
        col=dupcol;
            row=duprow;
            while(col>=0){
                if(board[row][col]=='Q') return false;
                col--;
            }

            // check if downward diagonal places of current queen attack other queen or not
        col=dupcol;
            row=duprow;
            while(col>=0 && row< board.length){
                if(board[row][col]=='Q') return false;
                col--;
                row++;
            }
        return true;
    }
    public List<String> makeBoard(char[][] board){
        List < String > res = new LinkedList < String > ();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
    
}
