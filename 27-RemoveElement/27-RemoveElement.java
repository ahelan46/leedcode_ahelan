// Last updated: 8/11/2026, 4:08:03 PM
class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0,k=0;
        while(i<nums.length){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
            i++;
        }
        return k;
    }
}