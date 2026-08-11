// Last updated: 8/11/2026, 4:04:02 PM
class Solution {
    public void moveZeroes(int[] nums) {
       int i,c=0;

       for(i=0;i<nums.length;i++){
             if(nums[i]!=0)
             nums[c++] = nums[i];
       } 
            while (c< nums.length) {
            nums[c++] = 0;
        }
            for(i=0;i<nums.length;i++)
              System.out.println(nums[i]+" ");
    }
}