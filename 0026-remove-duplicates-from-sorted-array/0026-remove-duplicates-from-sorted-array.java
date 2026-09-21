class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int x = 0;
        for(int i = 1; i < n; i++) {
            if(nums[x] != nums[i]) {
               nums[x+1] = nums[i];
               x++;
            }
        }
        return x+1;
    }
}