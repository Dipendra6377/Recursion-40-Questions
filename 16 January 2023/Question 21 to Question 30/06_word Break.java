// recursive
class Solution {
    HashMap<String,Boolean> map =new HashMap<>();
    boolean check=false;
    public boolean wordBreak(String s, List<String> word) {
        if(s.length()==0) return true;
        if(map.containsKey(s)) return map.get(s);

        for(String w :word){
            if(s.startsWith(w)){            // startwith if string leetcode start with l or leet it will true if yes
                check=check|| wordBreak(s.substring(w.length()),word);
            }
        }

        map.put(s,check);
        return map.get(s);
    }
}

//Iterative

class Solution {
    
    public boolean wordBreak(String s, List<String> word) {
        Set<String> set=new HashSet<>(word);
        boolean dp[]=new boolean[s.length()+1];
        dp[0]=true;
        for(int i=1;i<=s.length();i++){
            for(int j=0;j<i;j++){
                if(dp[j]&&set.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
