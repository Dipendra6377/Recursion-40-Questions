//https://leetcode.com/problems/subsets/solutions/27281/a-general-approach-to-backtracking-questions-in-java-subsets-permutations-combination-sum-palindrome-partitioning/

class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> subsets(int[] nums) {
       result = new ArrayList<>();
       Arrays.sort(nums);
        subset(nums,new ArrayList<>(),0);
        return result;
    }

    public void subset(int[] nums,ArrayList<Integer> list,int i){
        if(i==nums.length){
            result.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[i]);
        subset(nums,list,i+1);
        list.remove(list.size()-1);
        subset(nums,list,i+1);
    }
}


// can also be done by bit manipulation will be doing after bit manipulation
