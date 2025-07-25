class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        int res=0;
        for(int i:nums){
            hs.add(i);
        }
        for(int i:nums){
            if(hs.contains(i) && !hs.contains(i-1)){
                int c=0,curr=i;
                while(hs.contains(curr)){
                    hs.remove(curr);
                    c++;
                    curr++;
                }
                res=Math.max(c,res);
            }  
        }
        return res;
    }
}