// Last updated: 8/11/2026, 4:08:57 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,j;
        for(i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){ 
            if(nums[i]+nums[j]==target)
              return new int[]{i,j};
        }
        }
        return new int[]{};
    }
}