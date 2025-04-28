class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> hs=new HashSet<>();
        long ans=0,sum=0;
        int l=0;
        for(int r=0;r<nums.length;r++){
            while(hs.contains(nums[r])){
                hs.remove(nums[l]);
                sum-=nums[l];
                l++;
            }
            hs.add(nums[r]);
            sum+=nums[r];
            if(r-l+1 == k){
                ans=Math.max(ans,sum);
                hs.remove(nums[l]);
                sum-=nums[l];
                l++;
            }
        }
        return ans;
    }
}