class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        int n=differences.length;
        // int pre[]=new int[n+1];
        // pre[0]=1;
        // for(int i=1;i<n;i++){
        //     pre[i]=differences[i]+pre[i-1];
        // }
        int mi=0,ma=0,c=0;
        for(int i=0;i<n;i++){
            c+=differences[i];
            mi=Math.min(mi,c);
            ma=Math.max(ma,c);
            if(ma-mi > upper-lower){return 0;}
        }
        return (upper-lower)-(ma-mi)+1;
    }

}