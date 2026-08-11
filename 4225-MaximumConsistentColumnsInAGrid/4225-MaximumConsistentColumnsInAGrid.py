# Last updated: 8/11/2026, 3:58:15 PM
class Solution:
    def maxConsistentColumns(self, grid: List[List[int]], limit: int) -> int:
        m=len(grid)
        n=len(grid[0])

        dp=[1]*n
        for j in range(n):
            for i in range(j):
                ok=True
                for r in range(m):
                    if abs(grid[r][j]-grid[r][i])>limit:
                        ok=False
                        break
                if ok:
                    dp[j]=max(dp[j],dp[i]+1)
        return max(dp)