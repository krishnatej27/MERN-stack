class Solution {
    public int maxOperations(int[] nums, int k) {
        int c=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(k-nums[i])&& hm.get(k-nums[i])>0){
                c++;
                hm.put(k-nums[i],hm.get(k-nums[i])-1);
            }
            else{
                hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            }
        }
        return c;
    }
}