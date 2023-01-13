//A digit string is good if the digits (0-indexed) at even indices are even and the digits at odd indices are prime (2, 3, 5, or 7).

//For example, "2582" is good because the digits (2 and 8) at even positions are even and the digits (5 and 2) at odd positions are prime. 
//However, "3245" is not good because 3 is at an even index but is not even.

class Solution {
    static long mod= 1000000007;
    public int countGoodNumbers(long n) {
        long result=n%2==0?1:5;
        long x=20;

        for(long i=n/2;i>=1;i/=2){
            if(i%2==1)  result=result*x%mod;
            x=x*x%mod;
        }
        return (int) result;
    }
}


// 2 lets do thorough code to explain the problem better

class Solution {
    static long mod= 1000000007;
    public int countGoodNumbers(long n) {
        long first = (n%2)==0?(n/2):(n/2)+1;
        long second = (n/2);
        long mul1 = pow(5,first)%mod;  //deciding n/2 or n/2+1 depending on n is even
        long mul2 = pow(4,second)%mod; //second power would be n/2 only irrespective of even or odd
        long ans= 1;
        ans=ans*mul1%mod;
        ans=mul2!=0?(ans*mul2)%mod:ans;   // in case of single digit n mul2 will be 0 thats why u have to check it otherwise total ans will be 0

        return (int) ans; 
    }

    public long pow(long n,long power){ // this method computes pow(x,y) in O(logn) using divide & conquer
        long temp;
        if(power==0) return 1;
        temp=pow(n,power/2);  //computing power for pow(x,y/2) -> divide & conquer step

        if(power%2==0) return (temp*temp)%mod;
        else return (n*temp*temp)%mod;

        // if y is odd, x power y = x power y/2 * x power y/2 * x
		// if y is even, x power y = x power y/2 * x power y/2
    }
}

