// Last updated: 8/11/2026, 4:07:20 PM
class Solution {
    public int maxSubArray(int[] nums) {
       int c=nums[0],m=nums[0];
       for(int i=1;i<nums.length;i++){
        if(c<0)
            c=nums[i];
        else
            c+=nums[i];

        if(c>m)
            m=c;
       }
       return m; 
    }
}