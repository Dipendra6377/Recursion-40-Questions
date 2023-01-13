//Input:
Stack: 11 2 32 3 41
Output: 41 32 11 3 2


// recursion approach
  
  class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		if(s.isEmpty()) return s;
		int temp = s.peek();
		s.pop();
		sort(s);
		return sortItbro(s,temp);
	}
	public Stack<Integer> sortItbro(Stack<Integer> s,int x){
	    if(s.isEmpty() || s.peek()<x ){
	        s.push(x);
	        return s;
	    }
	    else{
	        int temp=s.peek();
	        s.pop();
	        sortItbro(s,x);
	        s.push(temp);
	    }
	    return s;
	}
}


//Iterative Approach

class GfG{
 public Stack<Integer> sort(Stack<Integer> s)
 {
 Stack<Integer> st = new Stack<>();
 int [] arr  = new int[s.size()];
 int j =0;
 while(s.size()>0){
  arr[j] =s.pop();
  j++;
 }
  java.util.Arrays.sort(arr);
 int n = arr.length;
 for(int i=0;  i<n;i++){
     st.add(arr[i]);
 }
 return st;
 }
}
