class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> p=new ArrayList<>();
        ArrayList<Integer> n=new ArrayList<>();
        for(int i:nums){
            if(i>0){
                p.add(i);
            }
            else{
                n.add(i);
            }
        }
        for(int i=0;i<nums.length/2;i++){
            nums[2*i]=p.get(i);
            nums[2*i+1]=n.get(i);
        }
        return nums;
    }
}