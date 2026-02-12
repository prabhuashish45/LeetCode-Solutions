class Solution {
    private int findMaxRow(int mat[][], int n, int mid) {
        int maxi = Integer.MIN_VALUE;
        int index = -1;
        for(int i = 0; i < n; i++) {
            if(mat[i][mid] > maxi) {
                index = i;
                maxi = mat[i][mid];
            }
        }
        return index;
    }
    public int[] findPeakGrid(int[][] mat) {
      int n = mat.length;
      int m = mat[0].length;

      int low = 0;
      int high = m-1;
      while(low <= high) { 
        int mid = (low + high) / 2;
        int midN = findMaxRow(mat, n, mid);

        int left = mid - 1 >= 0 ? mat[midN][mid-1] : -1;
        int right = mid + 1 < m ? mat[midN][mid+1] : -1;

        if(mat[midN][mid] > left && mat[midN][mid] > right) {
            return new int[] {midN, mid};
        } else if(mat[midN][mid] > left) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
      }

      return new int[] {-1, -1};
    }
}