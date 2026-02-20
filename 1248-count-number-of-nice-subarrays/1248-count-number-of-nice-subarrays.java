class Solution {
    private int countOdd(int[] nums, int k) {
        int n = nums.length;
        int res = 0;
        int l = 0;
        int r = 0;
        int oddCount = 0;
        while(r < n) {
            if(nums[r] % 2 == 1) {
                oddCount += 1;
            }

            while(oddCount > k) {
                if(nums[l] % 2 == 1) {
                    oddCount--;
                }
                l++;
            }
            res += (r - l + 1);
            r++;
        }
        return res;
    }
    public int numberOfSubarrays(int[] nums, int k) {
       return countOdd(nums, k) - countOdd(nums, k - 1);
    }
}
