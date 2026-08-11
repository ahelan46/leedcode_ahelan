// Last updated: 8/11/2026, 4:06:20 PM
public class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
        	return true;
        }
        int a = 0, b = s.length() - 1;
        char c, d;
        while(a <= b) {
        	c = s.charAt(a);
        	d = s.charAt(b);
        	if (!Character.isLetterOrDigit(c)) {
        		a++;
        	} else if(!Character.isLetterOrDigit(d)) {
        		b--;
        	} else {
        		if (Character.toLowerCase(c) != Character.toLowerCase(d)) {
        			return false;
        		}
        		a++;
        		b--;
        	}
        }
        
        return true;
    }
}