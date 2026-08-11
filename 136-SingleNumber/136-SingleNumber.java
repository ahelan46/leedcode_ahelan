// Last updated: 8/11/2026, 4:06:15 PM
class Solution {
    public int singleNumber(int[] nums) {
		int i,s=0;
		for(i=0;i<nums.length;i++)  
        	   s^=nums[i];
		return s;
	}

    }
