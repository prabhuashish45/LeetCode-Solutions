class Solution {
    public int longestOnes(int[] nums, int k) { 
        int n = nums.length;
        int maxLength = 0;
        int low = 0;
        int high = 0;
        int count = 0;
        while(high < n) {
           if(nums[high] == 0) count++;
           
           if(count > k) {
              if(nums[low] == 0) {
                count--;
              }
              low++;
           }

           if(count <= k) {
              maxLength = Math.max(maxLength, high - low + 1);
           }
           high++;
        }
        return maxLength;
    }
}