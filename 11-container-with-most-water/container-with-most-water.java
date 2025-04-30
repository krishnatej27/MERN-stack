class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int maxi=0;
        while(l<r){
            int mini=Math.min(height[l],height[r])*(r-l);
             maxi=Math.max(mini,maxi);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxi;
    }
}