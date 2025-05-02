class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res=new ArrayList<>();
        HashSet<Integer> a=new HashSet<>();
        HashSet<Integer> b=new HashSet<>();
        for(int i:nums1){
            a.add(i);
        }
        for(int i:nums2){
            b.add(i);
        }
        List<Integer> res1=new ArrayList<>();
        for(int i : a){
            if(!b.contains(i)){
                res1.add(i);
            }
        }
        List<Integer> res2=new ArrayList<>();
        for(int i : b){
            if(!a.contains(i)){
                res2.add(i);
            }
        }
        res.add(res1);
        res.add(res2);
        return res;
    }
}