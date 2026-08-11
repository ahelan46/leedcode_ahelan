// Last updated: 8/11/2026, 4:00:46 PM
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
               if(nums[j]==nums[i])
                c++;
            }
        }
        return c;
    }
}