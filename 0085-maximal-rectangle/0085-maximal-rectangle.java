class Solution {

    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        int maxi = 0;

        for(int i = 0; i < n; i++) {
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                int ind = st.pop();
                int pse = st.isEmpty() ? -1 : st.peek();
                int nse = i;
                int area = heights[ind] * (nse - pse - 1);
                maxi = Math.max(maxi, area);
            }
            st.push(i);
        }

        while(!st.isEmpty()) {
            int ind = st.pop();
            int pse = st.isEmpty() ? -1 : st.peek();
            int nse = n;
            int area = heights[ind] * (nse - pse - 1);
            maxi = Math.max(maxi, area);
        }

        return maxi;
    }

    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[] heights = new int[m];
        int maxArea = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(matrix[i][j] == '0') {   // FIXED HERE
                    heights[j] = 0;
                } else {
                    heights[j]++;
                }
            }

            maxArea = Math.max(maxArea, largestRectangleArea(heights));
        }

        return maxArea;
    }
}
