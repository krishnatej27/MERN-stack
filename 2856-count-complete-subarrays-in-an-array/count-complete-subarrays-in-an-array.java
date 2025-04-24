class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int l=0,res=0;
        int k=(int)Arrays.stream(nums).distinct().count();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            while(hm.size()==k){
                res+=nums.length-i;
                hm.put(nums[l],hm.get(nums[l])-1);
                if(hm.get(nums[l])==0){
                    hm.remove(nums[l]);
                }
                l++;
            }
        }
        return res;
    }
}