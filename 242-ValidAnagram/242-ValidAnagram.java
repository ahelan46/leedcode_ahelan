// Last updated: 8/11/2026, 4:04:18 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] count = new int[256];
        for(char ch: s.toCharArray()){
            count[ch]++;
        }
        for(char ch: t.toCharArray()){
            if(count[ch]==0){
                return false;
            }
            count[ch]--;
        }
        return true;
    }
}