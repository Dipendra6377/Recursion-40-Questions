class Solution
{
    
  public void printNos(int n)
    {
        //Your code here
        if(n==0) return;
        
        printNos(n-1);
        System.out.print(n + " ");
    }
}
