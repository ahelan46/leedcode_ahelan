// Last updated: 8/11/2026, 4:08:30 PM
class Solution {
    int value(char a){
        if(a=='I')return 1;
        if(a=='V')return 5;
        if(a=='X')return 10;
        if(a=='L')return 50;
        if(a=='C')return 100;
        if(a=='D')return 500;
        if(a=='M')return 1000;

        return 0;
    }
    public int romanToInt(String s) {
    int r=0;
    for(int i=0;i<s.length();i++){
        int c=value(s.charAt(i));
        if(i+1<s.length()&&c<value(s.charAt(i+1)))
            r-=c;
        else
            r+=c;


    }  
    return r;  
    }
}