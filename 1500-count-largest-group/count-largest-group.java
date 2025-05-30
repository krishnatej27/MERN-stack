class Solution {
    private int digit(int n){
        int c=0;
        while(n!=0){
            c+=n%10;
            n/=10;
        }
        return c;
    }
    public int countLargestGroup(int n) {
        // HashMap<Integer,Integer> hm=new HashMap<>();
        // for(int i=1;i<=n;i++){
        //     hm.put(digit(i),hm.getOrDefault(digit(i),0)+1);
        // }
        // int c=0,m=0;
        // for(int i:hm.values()){
        //     m=Math.max(m,i);
        // }
        // for(int i:hm.values()){
        //     if(i==m){
        //         c++;
        //     }
        // }
        // return c;
        int res[]=new int[37];
        for(int i=1;i<=n;i++){
            res[digit(i)]++;
        }
        int c=0,m=0;
        for(int i=0;i<res.length;i++){
            m=Math.max(res[i],m);
        }
        for(int i=0;i<res.length;i++){
            if(res[i]==m){
                c++;
            }
        }
        return c;
    }
}