// Last updated: 8/11/2026, 4:03:48 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<1)
        return false;
        while(n%4==0){
            n/=4;
        }
        if(n==1)
        return true;
        else
        return false;
    
    }
}