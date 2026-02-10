class Solution {
    private int[] findNSE(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();
        int[] nse = new int[n];
        for(int i = n - 1; i >= 0; i--) {
            while(!st.isEmpty() && arr[i] <= arr[st.peek()]) {
                st.pop();
            }
            if(!st.isEmpty() && arr[i] > arr[st.peek()]) {
                nse[i] = st.peek();
            } else {
                nse[i] = n;
            }
 
            st.push(i);
        }
        return nse;
    }
    private int[] findPSSE(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();
        int[] psse = new int[n];
        for(int i = 0; i < n; i++) {
            while(!st.isEmpty() && arr[i] <= arr[st.peek()]) {
                st.pop();
            }
            if(!st.isEmpty() && arr[i] > arr[st.peek()]) {
                psse[i] = st.peek();
            } else {
                psse[i] = -1;
            }
 
            st.push(i);
        }
        return psse;
    }
    public int largestRectangleArea(int[] heights) {
       int n = heights.length;
       int[] nse = findNSE(heights, n);
       int[] psse = findPSSE(heights, n);

       int maxi = Integer.MIN_VALUE;
       for(int i = 0; i < n; i++) {
          maxi = Math.max((heights[i] * (nse[i] - psse[i] - 1)), maxi); 
       }
       return maxi;
       
    }
}
