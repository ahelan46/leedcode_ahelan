// Last updated: 8/11/2026, 4:08:38 PM
class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int m=0;
        while(l<r){
            int h=Math.min(height[l],height[r]);
            int c= r-l;
            int d=h*c;
            if(d>m)
                m=d;
            if(height[l]<height[r])
                l++;
            else
                r--;

        }
        return m;
    }
}