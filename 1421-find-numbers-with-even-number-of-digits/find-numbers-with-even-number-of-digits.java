class Solution {
    private boolean count(int n){
        int c=0;
        while(n!=0){
            n/=10;
            c++;
        }
        return c%2==0;
    }
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(count(nums[i])){
                c++;
            }
        }
        return c;
    }
}