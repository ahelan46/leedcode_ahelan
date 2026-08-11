// Last updated: 8/11/2026, 4:00:01 PM
class Solution {
    public int sumBase(int n, int k) {
        int s=0;
        while(n>0){
            s+=n%k;
            n=n/k;
        }
        return s;
    }
}