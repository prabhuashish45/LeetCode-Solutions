class Solution {
    private void combinationSum3Helper(int index, int last, int k, int sum,int[] nums, List<List<Integer>> res, List<Integer> arr) {
        if(k == 0) {
            if(sum == 0) {
                res.add(new ArrayList<>(arr));
            }
            return;
        }

        if(index == last || sum < 0) {
            return;
        }
        arr.add(nums[index]);
        combinationSum3Helper(index+1, last,k-1, sum - nums[index], nums, res, arr);
        arr.remove(arr.size()-1);
        combinationSum3Helper(index+1, last,k, sum , nums, res, arr);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        combinationSum3Helper(0, 9,k, n , nums, res, arr);
        return res;
    }
}