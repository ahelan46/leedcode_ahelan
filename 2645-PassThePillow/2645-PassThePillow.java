// Last updated: 8/11/2026, 3:59:11 PM
class Solution {
    public int passThePillow(int n, int time) {
        int f=time/(n-1);//1
        int b=time%(n-1);//2 0
        int c=0;
        if(f%2!=0)
        c=n-b;
        else
        c=b+1;
        return c;
    }
}