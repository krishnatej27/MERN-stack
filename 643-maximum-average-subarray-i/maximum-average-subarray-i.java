class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans=0;
        for(int i=0;i<k;i++){
            ans+=nums[i];
        }
        double m=ans;
        for(int i=k;i<nums.length;i++){
            ans=ans-nums[i-k]+nums[i];
            m=Math.max(m,ans);
        }
        return m/k;
    }
}