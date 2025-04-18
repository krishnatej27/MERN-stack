class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int co=0;
        int r[]=new int[m];
        int c[]=new int[n];
        for(int x[]:indices){
            r[x[0]]++;
            c[x[1]]++;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((r[i]+c[j])%2!=0){
                    co++;
                }
            }
        }
        return co;
    }
}