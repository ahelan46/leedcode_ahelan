// Last updated: 8/11/2026, 3:59:36 PM
class Solution {
    public int minimumMoves(String s) {
        int i = 0; 
        int step = 0;
        while(i<s.length()){
            if(s.charAt(i)=='X'){
                i = i+3;
                step++;
            }
            else{
                i++;
            }
        }
        return step;
       
        
    }
}