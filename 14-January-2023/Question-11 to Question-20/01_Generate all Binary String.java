class Solution {
  public static List<String> generateBinaryStrings(int n) {
    // code here
        List<String> ans = new ArrayList<>();
        solve(0,n,"",ans);
        return ans;
  }
  
  static void solve(int i,int n,String s,List<String> ans){
      if(i==n){
          ans.add(s);
          return;
      }
      solve(i+1,n,s+'0',ans);
      if(i>0 && s.charAt(i-1)=='1'){
          return;
      }
      
      solve(i+1,n,s+'1',ans);
  }
}
     
     
