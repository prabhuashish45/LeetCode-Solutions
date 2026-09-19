class Solution {
    public int[] runningSum(int[] nums) {
        int currSum = 0;
        for(int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            nums[i] = nums[i] + currSum;
            currSum += temp;
        }
        return nums;
    }
}