class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length,c=0;
        // int res[]=new int[n+1];
        // res[0]=0;
        for(int i=1;i<n;i++){
            gain[i]+=gain[i-1];
        }
        for(int i=0;i<n;i++){
            c=Math.max(c,gain[i]);
        }
        return c;
    }
}