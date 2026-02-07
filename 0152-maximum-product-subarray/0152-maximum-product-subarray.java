class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxProduct = Integer.MIN_VALUE;
        int preProduct = 1;
        for(int i = 0; i < n; i++) {
            preProduct *= nums[i];
            maxProduct = Math.max(maxProduct, preProduct);

            if(nums[i] == 0) {
                preProduct = 1;
            }
        }
        int postProduct = 1;
        for(int i = n-1; i >= 0; i--) {
            postProduct *= nums[i];
            maxProduct = Math.max(maxProduct, postProduct);

            if(nums[i] == 0) {
                postProduct = 1;
            }
        }

        return maxProduct;
    }
}