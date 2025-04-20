class Solution {
    public int numRabbits(int[] answers) {
        int n=answers.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(answers[i],hm.getOrDefault(answers[i],0)+1);
        }
        int c=0;
        for(Map.Entry<Integer,Integer> h:hm.entrySet()){
            c+=Math.ceil((double)h.getValue()/(h.getKey()+1)) * (h.getKey()+1);
        }
        return c;
    }
}