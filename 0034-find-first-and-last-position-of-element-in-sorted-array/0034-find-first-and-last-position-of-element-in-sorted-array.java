class Solution {
    private int first(int[] nums, int n, int x) {
        int low = 0;
        int high = n - 1;
        int res = - 1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] == x) {
                res = mid;
                high = mid - 1;
            } else if(nums[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }
    private int last(int[] nums, int n, int x) {
        int low = 0;
        int high = n - 1;
        int res = -1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] == x) {
                res = mid;
                low = mid + 1;
            } else if (nums[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return res;
    }
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        return new int[] {first(nums, n, target), last(nums, n, target)};
    }
}