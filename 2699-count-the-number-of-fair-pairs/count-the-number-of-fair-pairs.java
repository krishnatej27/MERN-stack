class Solution {
    private int lower(int a[],int l,int r,int target){
        while(l<=r){
            int mid=l+(r-l)/2;
            if(a[mid]<target) l=mid+1;
            else r=mid-1;
        }
        return l;
    }
    private int upper(int a[],int l,int r,int target){
        while(l<=r){
            int mid=l+(r-l)/2;
            if(a[mid]<=target) l=mid+1;
            else r=mid-1;
        }
        return l;
    }
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long c=0;
        int n=nums.length;
        for(int i=0;i<n;i++) {
            int l=lower(nums,i+1,n-1,lower-nums[i]);
            int r=upper(nums,i+1,n-1,upper-nums[i]);
            c+=(r-l);
        }
        return c;
    }
}