// Last updated: 8/11/2026, 4:03:08 PM
class Solution {
    public int findMinArrowShots(int[][] points) {
       Arrays.sort(points,(a,b)-> Integer.compare(a[1],b[1]));
       int c=0;
       long e=Long.MIN_VALUE;

       for(int[] balloons : points){
            if(balloons[0]<=e)
               continue;
            else{
                c++;
                e=balloons[1];
            }

       }
       return c;

    }
}