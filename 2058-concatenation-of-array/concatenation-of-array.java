class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int c=0;
        int res[]=new int[n*2];
        for(int i=0;i<n;i++){
            res[c++]=nums[i];
        }
        for(int i=0;i<n;i++){
        while(c<n*2){
            res[c++]=nums[i++];
        }
        }
        return res;
    }
}