class Solution {
    public int search(int[] nums, int k) {
       int n = nums.length;
       int low = 0;
       int high = n - 1;
       while(low <= high) {
        int mid = (low + high) / 2;
        if(nums[mid] == k) {
            return mid;
        } else if(nums[low] <= nums[mid]) {
            if(nums[low] <= k && nums[mid] >= k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        } else {
            if(nums[mid] <= k && nums[high] >= k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
       }
       return -1;
    }
}
