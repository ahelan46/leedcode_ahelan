// Last updated: 8/11/2026, 4:00:37 PM
class Solution {
    public int diagonalSum(int[][] mat) {
        
	   int s=0,i,j;
	   for(i=0;i<mat.length;i++) {
		   for(j=0;j<mat.length;j++) {
			   if(j==i||(j+i)==mat.length-1)
			       s+=mat[i][j];	
			   
			}
	   }

			  return s;

    
    }
}