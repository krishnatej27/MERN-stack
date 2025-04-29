class Solution {
    public long countSubarrays(int[] nums, int k) {
        int maxe=Arrays.stream(nums).max().getAsInt();
        long ans=0,l=0;
        int maxsize=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==maxe){
                maxsize++;
            }
            while(maxsize==k){
                if(nums[(int)l]==maxe){
                    maxsize--;
                }
                l++;
            }
            ans+=l;
        }
        return ans;
    }
}