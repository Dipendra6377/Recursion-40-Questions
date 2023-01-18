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
