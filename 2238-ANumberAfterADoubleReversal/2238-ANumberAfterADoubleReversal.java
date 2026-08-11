// Last updated: 8/11/2026, 3:59:28 PM
class Solution {
    public boolean isSameAfterReversals(int num) {
        int d,ans=0,temp=num,s,an=0;

        while(num!=0){
            d=num%10;
            ans=ans*10+d;
            num/=10;
        }
        while(ans!=0){
            s=ans%10;
            an=an*10+s;
            ans/=10;
        }
        if(temp==an)
        return true;
        else
        return false;
    }
}