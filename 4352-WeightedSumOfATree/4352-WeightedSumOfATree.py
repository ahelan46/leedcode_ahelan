# Last updated: 8/11/2026, 3:58:04 PM
class Solution(object):
    def weightedSum(self, parent, nums):
        """
        :type parent: List[int]
        :type nums: List[int]
        :rtype: int
        """
        n=len(parent)
        children=[[] for _ in range(n)]
        for i in range(1,n):
            children[parent[i]].append(i)
        depth=[0]*n
        depth[0]=1
        height=1
        queue=[0]
        front=0
        while front<len(queue):
            node=queue[front]
            front+=1
        
            for child in children[node]:
                depth[child]=depth[node]+1
                height=max(height,depth[child])
                queue.append(child)
        ans=0
        for i in range(n):
            ans+=nums[i]*(height-depth[i]+1)
        return ans