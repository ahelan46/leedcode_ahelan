# Last updated: 8/11/2026, 3:58:03 PM
from math import comb
MOD=10**9+7

class Solution:
    def countValidSequences(self, n: int, k: int) -> int:
        if n<k:
            return 0
        total=comb(n-1,k-1)
        odd=0
        if(n-k)%2==0:
            m=(n-k)//2
            if m>=0:
                odd=comb(m+k-1,k-1)

        return (total-odd)%MOD
        