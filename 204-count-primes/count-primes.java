class Solution {
    public int countPrimes(int n) {
        boolean seen[]=new boolean[n];
        int c=0;
        for(int i=2;i<n;i++){
            if(seen[i]){
                continue;
            }
            c++;
            for(long j=(long)i*i;j<n;j+=i){
                seen[(int)j]=true;
            }
        }
        return c;
    }
}