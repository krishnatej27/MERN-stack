class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int c=0;
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            c+=nums[i];
            res[i]=c;
        }
        return res;
    }
}