// Last updated: 8/11/2026, 4:00:54 PM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int h=nums.length;
        int s[]=new int[h];
        int a=0;
        
        for(int k=0;k<n;k++){
            s[a++]=nums[k];
            s[a++]=nums[k+n];
        }
    return s;
    }
}