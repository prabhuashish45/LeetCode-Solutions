class Solution {
    private int totalHours(int nums[], int n, int x) {
        int total = 0;
        for(int i = 0; i < n; i++) {
            total += Math.ceil((double)nums[i]/(double)x);
        }
        return total;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int low = 1;
        int high = piles[0];
        for(int i = 0; i < n; i++) {
            high = Math.max(high, piles[i]);
        }

        while(low <= high) {
            int mid = low + (high - low) / 2;
            int total = totalHours(piles, n, mid);
            if(total <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }  
}