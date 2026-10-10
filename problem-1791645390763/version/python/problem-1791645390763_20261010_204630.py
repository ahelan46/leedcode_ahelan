# Last updated: 10/10/2026, 8:46:30 PM
1class Solution(object):
2    def maxProductPair(self, nums, target):
3        """
4        :type nums: List[int]
5        :type target: int
6        :rtype: List[int]
7        """
8        max_product=float('-inf')
9        ans=[-1,-1]
10        for i in range(len(nums)):
11            for j in range(i):
12                if nums[i]+nums[j]==target:
13                    if nums[i]>nums[j]:
14                        product=nums[i]*nums[j]
15                        if product>max_product:
16                            max_product=product
17                            ans=[i,j]
18                    elif nums[j]>nums[i]:
19                        product=nums[i]*nums[j]
20                        if product>max_product:
21                            max_product=product
22                            ans=[j,i]
23        return ans