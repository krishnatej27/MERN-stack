class Solution {
    private boolean check(String a,String b,int k){
        int n=a.length(),m=b.length();
        if(n%k >0 || m%k >0) return false;
        else{
            String sub=a.substring(0,k);
            return a.replace(sub,"").isEmpty() && b.replace(sub,"").isEmpty();
        }
    }
    public String gcdOfStrings(String str1, String str2) {
        int n=str1.length(),m=str2.length();
        for(int i=Math.min(n,m);i>=1;i--){
            if(check(str1,str2,i)){
                return str1.substring(0,i);
            }
        }
        return "";
    }
}