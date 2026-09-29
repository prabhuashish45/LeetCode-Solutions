class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> temp = new ArrayList<>();
        int i = 0, j = 0;
        while(i < m && j < n) {
            if(nums1[i] <= nums2[j]) {
                temp.add(nums1[i]);
                i++;
            } else {
                temp.add(nums2[j]);
                j++;
            }
        }

        while(i < m) {
            temp.add(nums1[i]);
            i++;
        } 
        while(j < n) {
            temp.add(nums2[j]);
            j++;
        }

        for(int k = 0; k < nums1.length; k++) {
            nums1[k] = temp.get(k);
        }
    }
}