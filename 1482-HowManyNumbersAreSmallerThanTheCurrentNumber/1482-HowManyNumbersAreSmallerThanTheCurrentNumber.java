// Last updated: 8/11/2026, 4:00:58 PM
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
      int n=nums.length;
      int[]r=new int[n];
      for(int i=0;i<n;i++){
        int c=0;
        for(int j=0;j<n;j++,r[i]=c){
            if(nums[j]<nums[i])
                c++;
        }
        
      }
        return r;
        
    }
}