class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0, 1);

        int count = 0;
        int sum = 0;

        for(int num: nums) {
            sum += num;

            if(mpp.containsKey(sum - goal)) {
                count += mpp.get(sum - goal);
            }

            mpp.put(sum, mpp.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}