class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        HashSet<Integer> hs=new HashSet<>();
        int n=instructions.length;
        int i=0;
        long c=0;
        while(i>=0 && i<n && !hs.contains(i)){
            hs.add(i);
            if(instructions[i].equals("add")){
                c+=values[i];
                i++;
            }
            else if(instructions[i].equals("jump")){
                i+=values[i];
            }
        }
        return c;
    }
}