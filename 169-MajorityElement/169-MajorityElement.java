// Last updated: 8/11/2026, 4:05:37 PM
class Solution {
    public int majorityElement(int[] nums) {
        // Arrays.sort(nums);
        int n=nums.length;
       // return nums[n/2];
       int t=0,c=0;
       for(int i=0;i<n;i++){
        if(c==0)
        t=nums[i];
        if(t==nums[i])
        c++;
        else
        c--;
       }
       return t; 
    }
}