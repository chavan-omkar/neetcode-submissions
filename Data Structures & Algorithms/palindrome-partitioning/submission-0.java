class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backTrack(s, result, new ArrayList<>(), 0);
        return result;
    }

    private void backTrack(String str, List<List<String>> result, List<String> curr, int startIndex) {
        if (startIndex == str.length()) {
            result.add(new ArrayList<>(curr));
            return;
        }

        for (int i = startIndex; i < str.length(); i++) {
            if (isPalindrome(str.substring(startIndex, i + 1))) {
                curr.add(str.substring(startIndex, i + 1));
                backTrack(str, result, curr, i + 1);
                curr.remove(curr.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String st) {
        int left = 0;
        int right = st.length() - 1;

        while (left < right) {
            char c1 = st.charAt(left);
            char c2 = st.charAt(right);
            if (Character.toLowerCase(c1) != Character.toLowerCase(c2)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
