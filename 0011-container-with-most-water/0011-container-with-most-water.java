class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int low = 0;
        int high = n - 1;
        int maxArea = 0;

        while(low < high) {
            int h = Math.min(height[low], height[high]);
            int width = high - low;
            maxArea = Math.max(maxArea, h * width);
            if(height[low] < height[high]) {
                low++;
            } else {
                high--;
            }
        }
        return maxArea;
    }
}