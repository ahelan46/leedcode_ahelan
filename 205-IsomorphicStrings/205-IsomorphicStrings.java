// Last updated: 8/11/2026, 4:05:00 PM
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Integer> m=new HashMap<>();
        Map<Character,Integer> tg=new HashMap<>();

        for(Integer i=0;i<s.length();i++){
            char a=s.charAt(i);
            char b=t.charAt(i);
            if(m.get(a)==tg.get(b)){
                m.put(a,i);
                tg.put(b,i);
            }
            else
                return false;
        }
        return true;
    }
}