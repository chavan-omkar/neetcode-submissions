class Solution {
    public List<String> generateParenthesis(int n) {
        if (n <= 0) {
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();
        StringBuilder builder = new StringBuilder()
;        backTrack(n, result, 0, 0, builder);
        return result;
    }

    private void backTrack(int n, List<String> result, int open, int close, StringBuilder builder) {
        if (open == n && close == n) {
            result.add(builder.toString());
            return;
        }

        if (open < n) {
            builder.append("(");
            backTrack(n, result, open + 1, close, builder);
            builder.deleteCharAt(builder.length()-1);
        }

        if (close < open) {
            builder.append(")");
            backTrack(n, result, open, close + 1, builder);
            builder.deleteCharAt(builder.length()-1);
        }
    }
}
