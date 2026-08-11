// Last updated: 8/11/2026, 3:58:13 PM
class Solution {
    public boolean checkGoodInteger(int n) {
        int ds=0;
        int s=0;
        while(n>0){
            int d=n%10;
            ds+=d;
            s+=d*d;
            n/=10;
        }
        return (s-ds)>=50;
    }
}