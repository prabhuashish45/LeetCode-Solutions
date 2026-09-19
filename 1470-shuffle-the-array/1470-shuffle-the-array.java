class Solution {
    public int[] shuffle(int[] nums, int n) {
        int res[] = new int[nums.length];
        int even = 0;
        int odd = 1;
        for(int i  = 0; i < n; i++) {
           res[even] = nums[i];
           res[odd] = nums[i+n];

           even += 2;
           odd += 2;
        }
        return res;
    }
}