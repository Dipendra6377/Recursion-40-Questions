// O(2^N * K)

class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res=new ArrayList<>();
        Arrays.sort(candidates);

        findcandidates(candidates,target,0,new ArrayList<>());

        return res;
    }

    public void findcandidates(int[] arr,int target,int index,List<Integer> list){
        
        if(target==0){
            res.add(new ArrayList<>(list));
            return;
        }
            

        for(int i=index;i<arr.length;i++){
            if(i>index && arr[i]==arr[i-1]) continue;
            if(target<arr[i]) break;
            
            list.add(arr[i]);
            findcandidates(arr,target-arr[i],i+1,list);
            list.remove(list.size()-1);

        }    
    }
}
