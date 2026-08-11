// Last updated: 8/11/2026, 4:05:58 PM
class Solution {
    public int maxProduct(int[] nums) {
        int m=nums[0],n=nums[0],r=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<0){
                int t=m;
                m=n;
                n=t;
            }
            m = Math.max(nums[i],m*nums[i]);
            n = Math.min(nums[i],n*nums[i]);
            r = Math.max(r,m);
        }
        return r;
    }
}