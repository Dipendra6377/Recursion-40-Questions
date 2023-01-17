class Solution {
    List<List<String>> res;
    public List<List<String>> partition(String s) {
        res=new ArrayList<>();

        findPartition(0,s,new ArrayList<>());
        return res;
    }

    public void findPartition(int ind,String s,List<String> list){
        if(ind==s.length()){
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i=ind;i<s.length();i++){
            if(isPalindrome(s,ind,i)){       // if string is palindrome then only
                list.add(s.substring(ind,i+1));
                findPartition(i+1,s,list);
                list.remove(list.size()-1);
            }
        }

    }

    public boolean isPalindrome(String s,int start,int end){  // to check whether string is Palindrome or not
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
