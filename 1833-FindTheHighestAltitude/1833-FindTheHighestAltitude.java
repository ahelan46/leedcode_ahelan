// Last updated: 8/11/2026, 4:00:17 PM
class Solution {
    public int largestAltitude(int[] gain) {
      int alt=0;
      int max=0;
      for(int i=0;i<gain.length;i++){
        alt+=gain[i];
        if(alt>max)
            max=alt;

      }  
      return max;
    }
}