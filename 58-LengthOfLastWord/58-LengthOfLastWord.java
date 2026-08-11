// Last updated: 8/11/2026, 4:07:18 PM
class Solution {
    public int lengthOfLastWord(String s) {
        int i=s.length()-1,length=0;
		while(i>=0&&s.charAt(i)==' ') {
			i--;
		}
		while(i>=0&&s.charAt(i)!=' ') {
			length++;
			i--;
		}
		 return length;
    }
}