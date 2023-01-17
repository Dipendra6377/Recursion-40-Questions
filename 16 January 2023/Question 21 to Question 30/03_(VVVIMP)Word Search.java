//  https://www.youtube.com/watch?v=4QjCc7HeR8s
// for video solution

class Solution {
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        if(n==0){
            return false;
        }
        int m=board[0].length;
        char letter = word.charAt(0);

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==letter && nextWord(board,word,i,j,n,m,0,letter))
                    return true;
            }
        }
        return false;
    }

    public boolean nextWord(char[][] board,String word,int i,int j,int n,int m,int index,char letter){
        board[i][j]='@';
        if(wordexist(board,word,i,j,n,m,index+1)){
            return true;
        }
        else{
            board[i][j]=letter;
        }
        return false;
    }

    public boolean wordexist(char[][] board,String word,int i,int j,int n,int m,int ind){
        if(ind==word.length()){
            return true;
        }
        char letter =word.charAt(ind);

        // for top element;

        if(i>0 && board[i-1][j]==letter && nextWord(board,word,i-1,j,n,m,ind,letter)) return true;
        // for down element

        if(i<n-1 && board[i+1][j]==letter && nextWord(board,word,i+1,j,n,m,ind,letter)) return true;
        // for right element

        if(j<m-1 && board[i][j+1]==letter && nextWord(board,word,i,j+1,n,m,ind,letter)) return true;
        // for left element

        if(j>0 && board[i][j-1]==letter && nextWord(board,word,i,j-1,n,m,ind,letter)) return true;

        return false;
    }
}
