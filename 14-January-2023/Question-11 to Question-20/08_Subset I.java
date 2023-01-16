class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n){
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int sum=0;
        
        subset(arr,0,sum,n,ans);
        return ans;
    }
    public void subset(ArrayList<Integer> arr,int index,int sum,int n,ArrayList<Integer> ans){
        if(index==n){
            ans.add(sum);
            return;
        }
        
        subset(arr,index+1,sum+arr.get(index),n,ans);
        
        subset(arr,index+1,sum,n,ans);
        
        
    }
}
