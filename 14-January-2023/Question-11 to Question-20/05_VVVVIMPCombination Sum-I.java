class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        result=new ArrayList<>();

        findCandidates(0,candidates,target,new ArrayList<>());

        return result;
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
            findCandidates(index,arr,target-arr[index],list);
            list.remove(list.size()-1);
        }
        findCandidates(index+1,arr,target,list);
    }
}
