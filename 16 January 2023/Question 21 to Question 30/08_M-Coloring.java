class solve {
    // Function to determine if graph can be coloured with at most M colours
    // such
    // that no two adjacent vertices of graph are coloured with same colour.
    public boolean graphColoring(boolean graph[][], int m, int n) {
        // Your code here
        int[] color=new int[n];
        if(fillColor(0,graph,color,m,n)) return true;
        
        return false;
    }
    
    public boolean fillColor(int node,boolean graph[][],int[] color,int m,int n){
        if(node==n){
            return true;
        }
        
        for(int i=1;i<=m;i++){
            if(FillingPossible(i,node,graph,color)){
                color[node]=i;
                
                if(fillColor(node+1,graph,color,m,n)){
                    return true;
                }
                else{
                    color[node]=0;
                }
            }
        }
        return false;
    }
    public boolean FillingPossible(int col,int node,boolean[][] graph,int[] color){
        
        for(int i=0;i<graph[node].length;i++){
            
            if(graph[node][i]==true){
                if(color[i]==col) return false;
            } 
        }
        return true;
    }
}
