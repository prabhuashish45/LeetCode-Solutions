class Solution {

    private void swap(int [] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

    public void moveZeroes(int[] nums) {
       int n = nums.length;
       if(n == 1) return;

       int i = -1;
       for(int j = 0; j < n ; j++) {
           if(nums[j] == 0) {
             i = j;
             break;
          }
       }

       if(i == - 1) return;
       for(int j = i+1; j < n; j++) {
            if(nums[j] != 0) {
                swap(nums, i, j);
                i++;
            }
        }
    }
}