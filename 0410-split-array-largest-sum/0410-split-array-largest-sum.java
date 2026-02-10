class Solution {
    private boolean isPossible(int[] arr, int n, int k, int mid) {
        int count = 1;
        int sumi = 0;
        for(int i = 0; i < n; i++) {
            if(sumi + arr[i] <= mid) {
                sumi += arr[i];
            } else {
                count++;
                sumi = arr[i];
            }
        }
        if(count <= k) return true;
        return false;
    }
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int maxi = nums[0];
        int sumi = 0;
        for(int i = 0; i < n; i++) {
            maxi = Math.max(nums[i], maxi);
            sumi += nums[i];
        }

        int low = maxi;
        int high = sumi;

        while(low <= high) {
            int mid = low + (high - low) / 2;
            boolean midN = isPossible(nums, n, k, mid);
            if(midN) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}