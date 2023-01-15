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


// Time complexity 
