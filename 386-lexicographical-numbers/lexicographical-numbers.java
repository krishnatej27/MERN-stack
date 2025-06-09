class Solution {
    public List<Integer> lexicalOrder(int n) {
       List<Integer> a=new ArrayList<>();
       int c=1;
       for(int i=1;i<=n;i++)
       {
        a.add(c);
        if(c*10<=n)
        {
            c*=10;
        }
        else
        {
            while(c%10==9 || c>=n)
            {
                c/=10;

            }
            c+=1;
        }
       }
       return a;
    }
}