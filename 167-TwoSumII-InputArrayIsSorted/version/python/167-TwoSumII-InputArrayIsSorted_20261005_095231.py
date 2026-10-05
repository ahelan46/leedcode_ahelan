# Last updated: 10/5/2026, 9:52:31 AM
1class Solution(object):
2    def twoSum(self, numbers, target):
3        """
4        :type numbers: List[int]
5        :type target: il=0nt
6        :rtype: List[int]
7        """
8        l=0
9        r=len(numbers)-1
10        while l<r:
11            t=numbers[l]+numbers[r]
12            if t==target:
13                return [l+1,r+1]
14            elif t<target:
15                l+=1
16            else:
17                r-=1
18
19        