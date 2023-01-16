class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> combinationSum3(int k, int n) {
        result=new ArrayList<>();

        findCombination(k,1,n,new ArrayList<>());
        return result;
    }

    public void findCombination(int k,int ind,int target,List<Integer> list){
        if(list.size()==k){
            if(target==0){
                result.add(new ArrayList<>(list));
            }
            return;
        }

        for(int i=ind;i<=9;i++){
            
            if(list.size()>=k && target!=0) break;
            if(i>target) break;
            list.add(i);
            findCombination(k,i+1,target-i,list);
            list.remove(list.size()-1);
        }
    }
}
