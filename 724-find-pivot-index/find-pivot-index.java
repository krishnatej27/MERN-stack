class Solution {
    public int pivotIndex(int[] nums) {
        int total=0,ls=0;
        for(int i:nums){
            total+=i;
        }
        for(int i=0;i<nums.length;i++){
            if(ls*2==total-nums[i]){
                return i;
            }
            ls+=nums[i];
        }
        return -1;
    }
}