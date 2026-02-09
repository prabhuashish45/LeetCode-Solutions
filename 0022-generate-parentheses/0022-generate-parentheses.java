class Solution {
    private void generate (int open, int close, int n, String current, List<String> res) {
        if(open + close == 2*n && open == close) {
            res.add(current);
            return;
        }

        if(open < n) {
            generate(open+1, close, n, current + "(" , res);
        }

        if(close < open) {
            generate(open, close+1, n, current + ")", res);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generate(0, 0, n, "",res);
        return res;
    }
}