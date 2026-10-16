class Solution {
    private int totalDays(int[] weights, int n, int mid) {
        int count = 1;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            if(sum + weights[i] > mid) {
                count += 1;
                sum = 0;
            } 
            sum += weights[i];
        }
        return count;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int sum = 0;
        int maxi = weights[0];
        for(int i = 0; i < n; i++) {
            sum += weights[i];
            maxi = Math.max(maxi, weights[i]);
        }

        int low = maxi;
        int high = sum;
        while(low <= high) {
            int mid = low + (high - low)/2;
            int totalD = totalDays(weights, n, mid);
            if(totalD <= days) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low; 
    }
}