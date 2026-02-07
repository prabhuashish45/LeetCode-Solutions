class Solution {
     private int[] findNSE(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = n - 1; i >= 0; i--) {
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            ans[i] = !st.isEmpty() ? st.peek() : n;
            st.push(i);
        }
        return ans;
    }
    private int[] findNGE(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = n - 1; i >= 0; i--) {
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }

            ans[i] = !st.isEmpty() ? st.peek() : n;
            st.push(i);
        }
        return ans;
    }

    private int[] findPSSE(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++) {
            while(!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }

            ans[i] = !st.isEmpty() ? st.peek() : -1;
            st.push(i);
        }
        return ans;
    }
    private int[] findPSGE(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++) {
            while(!st.isEmpty() && arr[st.peek()] < arr[i]) {
                st.pop();
            }

            ans[i] = !st.isEmpty() ? st.peek() : -1;
            st.push(i);
        }
        return ans;
    }
    public long subArrayRanges(int[] nums) {
        int n = nums.length;

        int[] nge = findNGE(nums);
        int[] pge = findPSGE(nums);
        int[] nse = findNSE(nums);
        int[] pse = findPSSE(nums);

        long sumMax = 0;
        long sumMin = 0;

        for (int i = 0; i < n; i++) {
            long maxCount = (long)(i - pge[i]) * (nge[i] - i);
            long minCount = (long)(i - pse[i]) * (nse[i] - i);

            sumMax += maxCount * nums[i];
            sumMin += minCount * nums[i];
        }

        return sumMax - sumMin;
    }
}