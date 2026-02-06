class Solution {
    private void reverse(int nums[], int low, int high) {
        while(low < high) {
            swap(nums,low, high);
            low++;
            high--;
        }
    }
    private void swap(int nums[], int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = -1;
        for(int j = n - 2; j >= 0; j--) {
            if(nums[j] < nums[j+1]) {
                i = j;
                break;
            }
        }

        if(i == -1) {
            reverse(nums, 0, n-1);
            return;
        }
        
        for(int j = n - 1; j >=0; j--) {
            if(nums[i] < nums[j]) {
                swap(nums, i, j);
            }
        }
        reverse(nums,i+1,n-1);
    }
}