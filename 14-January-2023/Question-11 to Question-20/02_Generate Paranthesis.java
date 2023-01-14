// 1

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        balance(list,"",0,0,n);
        return list;
    }

    public void balance(List<String> res,String s,int open,int close,int total){
        if(s.length()==2*total){
            res.add(s);
            return;
        }

        if(open<total){
            balance(res,s+'(',open+1,close,total);
        }

        if(close<open){
            balance(res,s+')',open,close+1,total);
        }

    }
}


//2 Iterative


public class Solution
{
    public List<String> generateParenthesis(int n)
    {
        List<List<String>> lists = new ArrayList<>();
        lists.add(Collections.singletonList(""));
        
        for (int i = 1; i <= n; ++i)
        {
            final List<String> list = new ArrayList<>();
            
            for (int j = 0; j < i; ++j)
            {
                for (final String first : lists.get(j))
                {
                    for (final String second : lists.get(i - 1 - j))
                    {
                        list.add("(" + first + ")" + second);
                    }
                }
            }
            
            lists.add(list);
        }
        
        return lists.get(lists.size() - 1);
    }
}
