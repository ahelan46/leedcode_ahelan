// Last updated: 8/11/2026, 4:02:57 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int c=0;
       int a=0;
       for(int i=0;i<nums.length;i++){
          
        if(nums[i]==1){
            a++;
            if(a>c)
                c=a;
          }
        else
            a=0; 
           
       } 
       return c;
    }
}