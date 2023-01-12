// dp 
class Solution {
    public int fib(int n) {
        if(n<=1) return n;

        int[] arr=new int[n+1];

        arr[0]=0;
        arr[1]=1;

        for(int i=2;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }

        return arr[n];
    }
}

// Recursive Approach

class Solution {
    public int fib(int n) {
        if(n==0 || n==1) return n;

        int ans =fib(n-1)+fib(n-2);
        
        return ans;
    }
}




