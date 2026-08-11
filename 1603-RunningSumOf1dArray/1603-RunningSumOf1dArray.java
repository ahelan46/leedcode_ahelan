// Last updated: 8/11/2026, 4:00:49 PM
class Solution {
    public int[] runningSum(int[] nums) {
        int i;
        for(i=1;i<nums.length;i++)
            nums[i]=nums[i]+nums[i-1];
        
        
        return nums;
    }
}