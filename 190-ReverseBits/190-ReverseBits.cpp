// Last updated: 8/11/2026, 4:05:22 PM
class Solution {
public:
    int reverseBits(int n) {
        int i,s=0;
        for(i=0;i<32;i++){
            int bit=n&1;
            s=(s<<1)|bit;
            n>>=1;
        }
        return s;
    }
};