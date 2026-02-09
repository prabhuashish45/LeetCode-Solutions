class Solution {
    public int trap(int[] height) {
       int n = height.length;
       int low = 0;
       int high = n-1;
       int leftMax = 0;
       int rightMax = 0;
       
       int total = 0;
       while(low < high) {
        if(height[low] <= height[high]) {
            if(height[low] < leftMax) {
                total += leftMax - height[low];
            } else {
                leftMax = height[low];
            }
            low++;
        } else {
            if(height[high] < rightMax) {
                total += rightMax - height[high];
            } else {
                rightMax = height[high];
            }
            high--;
        }
       }
       return total;
    }
}
