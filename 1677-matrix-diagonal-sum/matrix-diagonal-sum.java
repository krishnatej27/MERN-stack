class Solution {
    public int diagonalSum(int[][] mat) {
        int c=0;
        int n=mat.length;
        for(int i=0;i<n;i++){
            c+=mat[i][i];
            c+=mat[i][n-i-1];
        }
        if(n%2==1){
            c-=mat[n/2][n/2];
        }
        return c;
    }
}