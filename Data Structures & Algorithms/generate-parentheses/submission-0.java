class Solution {
    public List<String> generateParenthesis(int n) {
        if (n <= 0) {
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();
        backTrack(n, result, 0, 0, "");
        return result;
    }

    private void backTrack(int n, List<String> result, int open, int close, String temp) {
        if (open == n && close == n) {
            result.add(temp);
            return;
        }

        if (open < n) {
            StringBuilder str = new StringBuilder(temp);
            backTrack(n, result, open + 1, close, str.append("(").toString());
        }

        if (close < open) {
            StringBuilder str = new StringBuilder(temp);
            backTrack(n, result, open, close + 1, str.append(")").toString());
        }
    }
}
