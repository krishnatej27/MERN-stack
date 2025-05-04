class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int c=0;
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int i[]:dominoes){
            int a=i[0];
            int b=i[1];
            int key= a<b? a*10+b:b*10+a;
            c+=hm.getOrDefault(key,0);
            hm.put(key,hm.getOrDefault(key,0)+1);
        }
        return c;
    }
}