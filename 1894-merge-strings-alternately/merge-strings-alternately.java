class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int p1=0;
        int p2=0;
        StringBuilder res=new StringBuilder();
        while(p1<n && p2<m){
            res.append(word1.charAt(p1));
            res.append(word2.charAt(p2));
            p1++;
            p2++;
        }
        while(p1<n){
            res.append(word1.charAt(p1));
            p1++;
        }
        while(p2<m){
            res.append(word2.charAt(p2));
            p2++;
        }
        return res.toString();
    }
}