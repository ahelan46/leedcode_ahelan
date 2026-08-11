// Last updated: 8/11/2026, 3:58:29 PM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        byte[] freq = new byte[101];
        byte max = 0, res = 0;
        for (int n : nums) {
            byte f = ++freq[n];
            if (f > max) {
                max = f; res = max;
            } else if (f == max) 
                res += f;
        }
        return res;
    }
}
  
    