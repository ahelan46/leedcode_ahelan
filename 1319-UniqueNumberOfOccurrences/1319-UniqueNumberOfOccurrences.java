// Last updated: 8/11/2026, 4:01:20 PM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        int[] freq = new int[20010];

        
        for (int num : arr) {
            freq[num + 1000]++;
        }

        boolean[] used = new boolean[1001];

       
        for (int count : freq) {
            if (count > 0) {
                if (used[count])
                    return false;
                used[count] = true;
            }
        }

        return true;
    }
}