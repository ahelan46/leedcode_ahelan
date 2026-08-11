// Last updated: 8/11/2026, 3:59:48 PM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int a=nums.length;
        int arr[]=new int [a+a];
        for(int i=0;i<a;i++){
            arr[i]=nums[i];
            arr[i+a]=nums[i];
        }
        return arr;
    }
}