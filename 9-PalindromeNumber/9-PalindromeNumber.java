// Last updated: 8/11/2026, 4:08:42 PM
class Solution {
    public boolean isPalindrome(int x) {
       int temp=x,d,ans=0;
       while(x!=0){
          d=x%10;
          ans=ans*10+d;
          x=x/10;
       }
       if(temp<0)
       return false;
       else if(temp==ans)
       return true;
       else
       return false;
       
       
    }
}