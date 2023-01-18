class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> ans= new ArrayList<>();
        int[][] vis=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                vis[i][j]=0;
            }
        }
        if(m[0][0]==1){
            Ratwalk(m,n,0,0,ans,"",vis);
        }
        return ans;
    }
    
    public static void Ratwalk(int[][] a,int n,int i,int j,ArrayList<String> ans,String move,int[][] vis){
        if(i==n-1 && j==n-1){
            ans.add(move);
            return;
        }
        //for checking if rat can move down
        if(i<n-1 && vis[i+1][j]==0 && a[i+1][j]==1){
            vis[i][j]=1;
            Ratwalk(a,n,i+1,j,ans,move + 'D',vis);
            vis[i][j]=0;
        }
        
        //for checking if rat can move left
        if(j>0 && vis[i][j-1]==0 && a[i][j-1]==1){
            vis[i][j]=1;
            Ratwalk(a,n,i,j-1,ans,move + 'L',vis);
            vis[i][j]=0;
        }
        
        //for checking if rat can move right
        if(j<n-1 && vis[i][j+1]==0 && a[i][j+1]==1){
            vis[i][j]=1;
            Ratwalk(a,n,i,j+1,ans,move + 'R',vis);
            vis[i][j]=0;
        }
        
        //for checking if rat can move down
        if(i>0 && vis[i-1][j]==0 && a[i-1][j]==1){
            vis[i][j]=1;
            Ratwalk(a,n,i-1,j,ans,move + 'U',vis);
            vis[i][j]=0;
        }
    }
}
