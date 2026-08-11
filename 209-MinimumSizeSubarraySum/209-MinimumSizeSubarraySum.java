// Last updated: 8/11/2026, 4:04:52 PM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0,s=0;
        int m=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            while(s>=target){
                m=Math.min(m,i-l+1);
                s-=nums[l];
                l++;
            }
        }
        return m==Integer.MAX_VALUE?0:m;
    }
}