class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        res=new ArrayList<>();

        findSubset(nums,0,new ArrayList<>());

        return res;
    }

    public void findSubset(int[] nums,int index,List<Integer> list){
        
        res.add(new ArrayList<>(list));
           

        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1]) continue;
            list.add(nums[i]);
            findSubset(nums,i+1,list);
            list.remove(list.size()-1);
        }
    }
}
