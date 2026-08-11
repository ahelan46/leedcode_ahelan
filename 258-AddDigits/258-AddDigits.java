// Last updated: 8/11/2026, 4:04:15 PM
class Solution {
    public int addDigits(int num) {
        int d,s;
        while(num>=10){

          s=0;
        while(num>0){
              d=num%10;
              s+=d;
              num/=10;

        }
        
        num=s;
    }
    return num;
}
}