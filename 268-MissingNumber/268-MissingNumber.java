// Last updated: 8/11/2026, 4:04:10 PM
class Solution {
    public int missingNumber(int[] nums) {
        int i,sum=0,n,s,a;
        for(i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        s=nums.length*(nums.length+1)/2;
        a=s-sum;
        return a;
    }
}