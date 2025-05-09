class Solution {
    public int equalPairs(int[][] grid) {
        int c=0;
        HashMap<String,Integer> hm=new HashMap<>();
        for(int row[]:grid){
            String key=Arrays.toString(row);
            hm.put(key,hm.getOrDefault(key,0)+1);
        }
        for(int col=0;col<grid[0].length;col++){
            int colu[]=new int[grid.length];
            for(int row=0;row<grid.length;row++){
                colu[row]=grid[row][col];
            }
            String key=Arrays.toString(colu);
            c+=hm.getOrDefault(key,0);
        }
        return c;
    }
}