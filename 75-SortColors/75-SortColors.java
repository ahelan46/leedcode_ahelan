// Last updated: 8/11/2026, 4:06:50 PM
class Solution {
    public void sortColors(int[] nums) {
        int c=0,s=0,i;
        for(i=0;i<nums.length;i++) {
			

		
		if(nums[i]==0) {
			c++;
		}
		
		else if(nums[i]==1) {
			s++;
		}
		}
		for(i=0;i<c;i++) {
			nums[i]=0;
		}
		for(i=c;i<(c+s);i++) {
			nums[i]=1;
		}
		for(i=(c+s);i<nums.length;i++) {
			nums[i]=2;
		}
		for(i=0;i<nums.length;i++)
		System.out.print(nums[i]+" ");

	}
    }
