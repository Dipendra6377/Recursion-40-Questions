// Recursion does not apply here as test cases are large so it will show time limit exceeded as excepted Time complexity is O(1) so use formula instead


class Solution {
    long sumOfSeries(long N) {
        // code here
        long ans = (N*N*(N+1)*(N+1))/4;
        
        return ans;
    }
}

