# Last updated: 9/13/2026, 9:24:47 AM
1from bisect import bisect_left
2class Solution(object):
3    def shadowPairs(self, nums):
4        """
5        :type nums: List[int]
6        :rtype: int
7        """
8        stack=[]
9        ans=0
10        # for i in range(n):
11        #     for j in range(i+1,n):
12        #         if nums[i]>=nums[j]:
13        #             continue
14                
15        #         sh=True
16        #         for k in range(i+1,j):
17        #             if nums[k] < nums[i] < nums[j]:
18        #                 sh=False
19        #                 break
20        #         if sh:
21        #             ans+=1
22        for x in nums:
23            ans+=bisect_left(stack,x)
24            while stack and stack[-1]>x:
25                stack.pop()
26            stack.append(x)
27        return ans            