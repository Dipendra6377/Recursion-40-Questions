class Solution {
    public void solveSudoku(char[][] board) {
        PutValidNumber(board);
    }

    public boolean PutValidNumber(char[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){

                    for(char c='1';c<='9';c++){
                        if(valid(board,i,j,c)){
                            board[i][j]=c;
                            if(PutValidNumber(board)){
                                return true;
                            }
                        else{
                            board[i][j]='.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public boolean valid(char[][] board,int row,int col,char c){
        for(int i=0;i<9;i++){
            if(board[i][col]==c) return false;
            if(board[row][i]==c) return false;
            if(board[3*(row/3)+(i/3)][3*(col/3)+(i%3)]==c) return false;
        }
        return true;
    }
}
