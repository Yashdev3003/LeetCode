class Solution {
    public int maxArea(int[] height) {
        int maxArea=0;
        for(int i=0; i<height.length; i++) {
            int area=0;
            int diff=0;
            for(int j=0; j<height.length; j++) {
                if(j>i) {
                    diff=j-i;
                } else {
                    diff=i-j;
                }
                if(height[i]>height[j]) {
                    area=height[j]*diff;
                } else {
                    area=height[i]*diff;
                }
                if(area>maxArea) {
                    maxArea=area;
                }
            }
        }
        return maxArea;
    }
}
