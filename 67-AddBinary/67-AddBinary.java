// Last updated: 8/11/2026, 4:07:03 PM
class Solution {
    public String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        int c=0;
        StringBuffer r=new StringBuffer();
        while(i>=0||j>=0||c!=0){
            int s=c;
            if(i>=0) s+= a.charAt(i--)-'0';
            if(j>=0) s+= b.charAt(j--)-'0';
            r.append(s%2);
            c=s/2;


        }
        return r.reverse().toString();
    }
}