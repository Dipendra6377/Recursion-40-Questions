// 
class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int i=0;
        int j=s.length()-1;

        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++; j--;
        }
        return true;
    }
}


//Recursive approach
class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^a-z0-9]", "");
        return istrue(0,s);
    }

    public boolean istrue(int i,String s){
        if(i>=s.length()/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(s.length()-i-1)){
            return false;
        }
        return istrue(i+1,s);
    }
}
