class Solution {
  private int totalBouquets(int[] nums, int n, int k, int mid) {
    int totalB = 0;
    int count = 0;
    for (int i = 0; i < n; i++) {
      if (nums[i] <= mid) {
        count += 1;
      } else {
        totalB += (count / k);
        count = 0;
      }
    }
    totalB += (count / k);
    return totalB;
  }

  public int minDays(int[] bloomDay, int m, int k) {
    int n = bloomDay.length;
    if (n < (m * k)) return -1;
    int low = bloomDay[0];
    int high = bloomDay[0];
    for (int i = 0; i < n; i++) {
      low = Math.min(low, bloomDay[i]);
      high = Math.max(high, bloomDay[i]);
    }
    
    int ans = -1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      int totalB = totalBouquets(bloomDay, n, k, mid);
      if (totalB < m) {
        low = mid + 1;
      } else {
        ans = mid;
        high = mid - 1;
      }
    }
    return ans;
  }
}