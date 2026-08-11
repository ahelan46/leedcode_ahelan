// Last updated: 8/11/2026, 4:07:34 PM
class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        for(int i=0;i<nums.length;i++){
         if(count==nums[i]) count++;
         else if(nums[i]>count) return count;
        }
        return count;
    }
}