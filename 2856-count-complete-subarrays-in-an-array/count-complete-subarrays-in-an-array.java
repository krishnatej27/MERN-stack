class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length;
        Set<Integer> unique = new HashSet<>();
        for (int num : nums) {
            unique.add(num);
        }
        int totalDistinct = unique.size();
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            Set<Integer> windowSet = new HashSet<>();
            for (int j = i; j < n; j++) {
                windowSet.add(nums[j]);
                if (windowSet.size() == totalDistinct) {
                    count += n - j;
                    break;
                }
            }
        }
        return count;
    }
}
