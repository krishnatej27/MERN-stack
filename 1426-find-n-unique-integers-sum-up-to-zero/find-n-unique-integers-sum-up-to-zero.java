class Solution {
    public int[] sumZero(int n) {
        int res[]=new int[n];
        for(int i=0;i<n-1;i+=2){
            res[i]=i+1;
            res[i+1]=-(i+1);
        }
        return res;
    }
}