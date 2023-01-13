//A number N is called a factorial number if it is the factorial of a positive integer. For example, the first few factorial numbers are 1, 2, 6, 24, 120,
// 1! =1  2! =2  3!=6 4!=24 etc


//1 
class Solution{
    static ArrayList<Long> factorialNumbers(long n){
        // code here
        long a=1,i=1;
        ArrayList<Long> list = new ArrayList<>();
        
        while(i*a<=n){
            a=i*a;
            list.add(a);
            i++;
        }
        
        return list;
    }
}


// 2  Recursive Approach

class Solution{
    static ArrayList<Long> factorialNumbers(long n){
        // code here
        int i=1;
        ArrayList<Long> list = new ArrayList<>();
        
        while(factorial(i)<=n){
            list.add(factorial(i));
            i++;
        }
        return list;
    }
    
    static long factorial(long n){
        if(n==0 || n==1){
            return 1;
        }
        
        return n*factorial(n-1);
    }
}
