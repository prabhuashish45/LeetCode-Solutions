class Solution {
    private void combinationSumHelper(int index, int n, int sum, int [] candidates, List<Integer> arr, List<List<Integer>> res) {
        if(sum == 0) {
            res.add(new ArrayList<>(arr));
            return;
        }
        if(index == n || sum < 0) {
            return;
        }
        
        arr.add(candidates[index]);
        combinationSumHelper(index, n, sum - candidates[index],candidates, arr, res);
        arr.remove(arr.size()-1);
        combinationSumHelper(index+1, n, sum,candidates, arr, res);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n = candidates.length;
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        combinationSumHelper(0, n, target, candidates, arr, res);
        return res;
    }
}