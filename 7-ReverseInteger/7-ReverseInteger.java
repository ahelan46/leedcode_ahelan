// Last updated: 8/11/2026, 4:08:43 PM
class Solution {
    public int reverse(int x) {
        int d,ans=0;
        

        
        while (x != 0) {
            d = x % 10;
            x /= 10;
            
 if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && d > 7)) 
return 0;
            
if (ans < Integer.MIN_VALUE / 10 ||  (ans == Integer.MIN_VALUE / 10 && d < -8)) 
 return 0;
            
            
            ans = ans * 10 + d;
        }
        
        return ans;
    }
}