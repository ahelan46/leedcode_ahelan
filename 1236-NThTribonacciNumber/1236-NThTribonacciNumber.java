// Last updated: 8/11/2026, 4:01:30 PM
class Solution {
    public int tribonacci(int n) {
     if(n==0||n==1)
        return n;
    else if(n==2)
        return 1;
       int n1=0,n2=1, n3=1,n4=0;
      
       for(int i=3;i<=n;i++){
        n4=n1+n2+n3;
        
        n1=n2;
        
        n2=n3;
        n3=n4;
        
        
       }
      return n4;  
    }
}