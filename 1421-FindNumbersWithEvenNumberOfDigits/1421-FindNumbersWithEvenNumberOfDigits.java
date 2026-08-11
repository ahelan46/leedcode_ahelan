// Last updated: 8/11/2026, 4:01:14 PM
class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int num:nums){
            int d=0;
            while(num>0){
                d++;
                num=num/10;
            }
            if(d%2==0)
                c++;
        }
        return c;
    }
}