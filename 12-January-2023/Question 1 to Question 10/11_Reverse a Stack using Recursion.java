//Input:
St = {3,2,1,7,6}
Output:
{6,7,1,2,3}


class Solution
{ 
    static void reverse(Stack<Integer> s)
    {
        // add your code here
        if(s.isEmpty()) return;
        
        int temp = s.peek();
        s.pop();
        reverse(s);
        reverseItbro(s,temp);
    }
    
    static void reverseItbro(Stack<Integer> s,int x){
        if(s.isEmpty()){
            s.push(x);
        }
        else{
        int temp=s.peek();
        s.pop();
        reverseItbro(s,x);
        s.push(temp);
        }
    }
}
