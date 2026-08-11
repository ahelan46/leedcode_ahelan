// Last updated: 8/11/2026, 4:03:32 PM
class Solution {
    public int firstUniqChar(String s) {
        int f[]=new int[256];
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			f[ch]++;
		}
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(f[ch]==1) {
				return i;
			}
		}
		return -1;
    }
}