// Last updated: 8/11/2026, 3:59:50 PM
class Solution {
    public int[] buildArray(int[] nums) {
        int n=nums.length;
        int[] c=new int[n];
        for(int i=0;i<nums.length;i++){
            c[i]=nums[nums[i]];
        }
        return c;
    }
}