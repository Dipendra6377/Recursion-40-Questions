class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        List<Integer> sublist = new ArrayList<>();

        permute(list,sublist,nums);

        return list;
    }

    public void permute(List<List<Integer>> list , List<Integer> sublist,int[]nums){
        if(nums.length==sublist.size()){
            list.add(new ArrayList<>(sublist));
        }
        else{
            for(int i=0;i<nums.length;i++){
                if(sublist.contains(nums[i])) continue;

                sublist.add(nums[i]);
                permute(list,sublist,nums);
                sublist.remove(sublist.size()-1);
            }
        }
    }
}
