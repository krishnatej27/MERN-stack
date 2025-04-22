class Solution {
    public String reverseVowels(String s) {
        char w[]=s.toCharArray();
        int l=0,r=s.length()-1;
        String v="aeiouAEIOU";
        while(l<r){
            while(l<r && v.indexOf(w[l])==-1){
                l++;
            }
            while(l<r && v.indexOf(w[r])==-1){
                r--;
            }
            char temp=w[l];
            w[l]=w[r];
            w[r]=temp;
            l++;
            r--;
        }
        String ans=new String(w);
        return ans;
    }
}