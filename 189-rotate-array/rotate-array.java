class Solution {
    private void swap(int nums[],int i,int j){
        int l=i,r=j;
        while(l<r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k%=n;
        if(k<0){
            k+=n;
        }
        swap(nums,0,n-k-1);
        swap(nums,n-k,n-1);
        swap(nums,0,n-1);
    }
}