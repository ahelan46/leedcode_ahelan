// Last updated: 8/11/2026, 4:00:31 PM
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int s=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int l=j-i+1;
                if(l%2==1){
                for(int k=i;k<=j;k++)
                    s+=arr[k];
                }
            }
        }
        return s;
    }
}