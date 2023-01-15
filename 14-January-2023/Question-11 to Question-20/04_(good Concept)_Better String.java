class Solution {
    public static String betterString(String str1, String str2) {
        // Code here
          int a = calculatesub(str1);
          int b = calculatesub(str2);
          
          if(a<b) return str2;
          return str1;
    }
    
    public static int calculatesub(String str){
        int dp[] =new int[str.length() +1];
        HashMap<Character,Integer> map= new HashMap<>(); 
        dp[0]=1;
        
        for(int i=1;i<=str.length();i++){
            dp[i]=2*dp[i-1];
            char ch = str.charAt(i-1);
            if(map.containsKey(ch)){
                int ind = map.get(ch);
                dp[i]-=dp[ind-1];
                
                map.replace(ch,i);
            }
            
            map.put(ch,i);
        }
        return dp[str.length()];
    }
}
