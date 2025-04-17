class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[]=new int[nums.length];
        int p1=0,p2=n,k=0;
        while(p1<n && p2<nums.length){
            ans[k++]=nums[p1++];
            ans[k++]=nums[p2++];
        }
        return ans;
    }
}