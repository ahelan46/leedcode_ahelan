// Last updated: 8/11/2026, 4:01:17 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int d,ans=0,s=1,b=0;
        while(n!=0){
            d=n%10;
           
            b=b+d;
            s=s*d;
            n/=10;
        }
           
            
         return s-b;
         
    }
}