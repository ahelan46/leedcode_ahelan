# Last updated: 9/13/2026, 8:49:43 AM
1class Solution(object):
2    def cyclicShift(self, n, grid, rowShift, colShift):
3        """
4        :type n: int
5        :type grid: List[List[int]]
6        :type rowShift: List[int]
7        :type colShift: List[int]
8        :rtype: List[List[int]]
9        """
10        n=len(grid)
11        for i in range(n):
12            k=rowShift[i]%n
13            grid[i]=grid[i][k:]+grid[i][:k]
14
15        for j in range(n):
16            k=colShift[j]%n
17            tp=[]
18            for i in range(n):
19                tp.append(grid[(i+k)%n][j])
20            for i in range(n):
21                grid[i][j]=tp[i]
22
23        return grid
24        