class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int c=0;
        for(int n=low;n<=high;n++){
            String s=Integer.toString(n);
            int l=s.length();
            if(l%2!=0) continue;
            int h=l/2;
            int le=0,r=0;
            for(int i=0;i<h;i++){
                le+=s.charAt(i)-'0';
            }
            for(int i=h;i<l;i++){
                r+=s.charAt(i)-'0';
            }
            if(le==r){
                c++;
            }
        }
        return c;
    }
}