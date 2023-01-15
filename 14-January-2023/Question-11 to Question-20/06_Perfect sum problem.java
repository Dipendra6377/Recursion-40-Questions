// Time complexity 2^n     Space Complexity  logN


class Solution{
    List<List<Integer>> result;

	public int perfectSum(int arr[],int n, int sum) 
	{ 
	    // Your code goes here
	   result=new ArrayList<>();

        findCandidates(0,arr,sum,new ArrayList<>());

        return result.size();
	} 

    public void findCandidates(int index,int[] arr,int target,List<Integer> list){
        if(index==arr.length){
            if(target==0){
                result.add(new ArrayList<>(list));
            }
            return;
        }

        if(arr[index]<=target){
            list.add(arr[index]);
            findCandidates(index+1,arr,target-arr[index],list);
            list.remove(list.size()-1);
        }
        findCandidates(index+1,arr,target,list);
    }
}


// Time complexity O(N*Sum)   space is also same


class Solution{

    static int mod = (int)1e9+7;
	public int perfectSum(int arr[],int n, int sum) 
	{ 
	    // Your code goes here
	    int[][] dp = new int[n][sum+1];
	    
	    for(int[] row:dp){
	        Arrays.fill(row,-1);
	    }
	    
	    return solve(n-1,arr,sum,dp);
	} 
	
	public int solve(int index,int[] arr,int target,int[][] dp){
	    if(index==0){
	        if(target==0 && arr[0]==0) return 2;
	        
	        if(target==0 || target ==arr[0]) return 1;
	        
	        return 0;
	    }
	    if(dp[index][target] != -1){
            return dp[index][target];
        }
        
        int notTake = solve(index - 1, arr, target, dp);
        int take = 0;
        if(arr[index] <= target){
            take = solve(index - 1, arr, target - arr[index], dp);
        }
        
        return dp[index][target] = (notTake + take) % mod;
	}
}
