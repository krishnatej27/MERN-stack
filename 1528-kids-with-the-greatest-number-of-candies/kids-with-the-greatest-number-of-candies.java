class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans=new ArrayList<>();
        int m=0;
        for(int i:candies){
            m=Math.max(m,i);
        }
        for(int i:candies){
            ans.add(i+extraCandies>=m);
        }
        return ans;
    }
}