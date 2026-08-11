// Last updated: 8/11/2026, 4:03:45 PM
class Solution {
    public void reverseString(char[] s) {
        int S=0;
        int E=s.length-1;
        while(S<E){
		 char temp=s[S];
		 s[S]=s[E];
		 s[E]=temp;
		 S++;
		 E--;
		 }
		 
		 
    }
}