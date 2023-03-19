class Solution {
    int[][] directions =new int[][]{{-2, -1}, {-1, -2}, {1, -2}, {2, -1}, {2, 1}, {1, 2}, {-1, 2}, {-2, 1}};
    public boolean checkValidGrid(int[][] grid) {
        int n =grid.length;
        int[][] vis=new int[n][n];

        vis[0][0]=1;
        return backtrack(grid,vis,0,0,1);
    }

    public boolean backtrack(int[][] grid,int[][] vis,int row,int col,int count){
        int n=grid.length;
        if(count==n*n){
            return true;
        }

        for(int[] dir :directions){
            int newrow = row+dir[0];
            int newcol = col+dir[1];

            if(newrow>=0 &&newrow<n && newcol>=0 && newcol<n && grid[newrow][newcol]==count && vis[newrow][newcol]==0){
                vis[newrow][newcol]=1;

                if(backtrack(grid,vis,newrow,newcol,count+1)){
                    return true;
                }
                //vis[newrow][newcol]=0;
            }
        }
        return false;
    }
}
