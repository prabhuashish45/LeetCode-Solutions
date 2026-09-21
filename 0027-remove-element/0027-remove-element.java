class Solution {
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int j = -1;
        for(int i = 0; i < n; i++) {
            if(nums[i] == val) {
                j = i;
                break;
            }
        }
        
        if(j == -1) return n;

        for(int i = j+1; i < n; i++) {
            if(nums[i] != val) {
                swap(nums, i, j);
                j++;
            }
        }
        return j;
    }
}