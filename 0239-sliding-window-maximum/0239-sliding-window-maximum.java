class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int n = arr.length;
        int res[];
        if(k >= n) {
            res = new int[1];
        } else {
            res = new int [n-k+1];
        }
        
        int ansIndex = 0;
        Deque<Integer> dq = new LinkedList<>();

        for(int i = 0; i < n; i++) {
            if(!dq.isEmpty() && dq.peekFirst() <= (i-k)) {
                dq.pollFirst();
            }

            while(!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.pollLast();
            }

            dq.offerLast(i);
            if(i >= (k - 1)) {
                res[ansIndex++] = arr[dq.peekFirst()];
            }
        }

        return res;
    }
}