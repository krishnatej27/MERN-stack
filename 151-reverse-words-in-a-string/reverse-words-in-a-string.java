class Solution {
    public String reverseWords(String s) {
        String w[]=s.trim().split("\\s+");
        int l=0,r=w.length-1;
        while(l<r){
            String temp=w[l];
            w[l]=w[r];
            w[r]=temp;
            l++;
            r--;
        }
        return String.join(" ",w);
    }
}