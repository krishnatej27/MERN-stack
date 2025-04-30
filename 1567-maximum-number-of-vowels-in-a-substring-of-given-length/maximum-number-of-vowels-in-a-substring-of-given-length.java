class Solution {
    private boolean isVowel(char s){
        if(s=='a' || s=='e' || s=='i' || s=='o' || s=='u'){
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k) {
        int ans=0,m=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                ans++;
            }
        }
        m=ans;
        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                ans++;
            }
            if(isVowel(s.charAt(i-k))){
                ans--;
            }
            m=Math.max(m,ans);
        }
        return m;
    }
}