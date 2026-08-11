// Last updated: 8/11/2026, 4:03:30 PM
class Solution {
    public char findTheDifference(String s, String t) {
        int a=0,b=0;
        for(int i=0;i<s.length();i++)
            a+=s.charAt(i);
        for(int i=0;i<t.length();i++)
            b+=t.charAt(i);
        return (char)(b-a);
    }
}