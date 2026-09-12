class Solution {
    public int maxArea(int[] height) {
        int n=height.length-1;
        int l=0;
        int r=n;
        int maxwater=0;
        while(l<r){
            int h=Math.min(height[l],height[r]);
            int w=r-l;
            int currarea=h*w;
          maxwater=Math.max(maxwater,currarea);
          if(height[l]<height[r]){
            l++;
        }else{
            r--;
        }
        }
        
        return maxwater;
    }
}