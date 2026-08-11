// Last updated: 8/11/2026, 4:03:55 PM
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<1)
        return false;
        while(n%3==0){
            n/=3;
        }
        if(n==1)
        return true;
        else
        return false;
    }
}