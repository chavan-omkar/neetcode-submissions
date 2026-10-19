class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.isBlank()) {
            return new ArrayList<>();
        }
        Map<String, String> map = new HashMap<>();
        set(map);
        List<String> result = new ArrayList<>();
        List<String> wordList = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            wordList.add(map.get(String.valueOf(digits.charAt(i))));
        }
        backTrack(digits, wordList, result, "", 0);
        return result;
    }

    private void backTrack(
        String digit, List<String> wordList, List<String> result, String curr, int startIndex) {
        if (curr.length() == digit.length()) {
            result.add(curr);
            return;
        }
        String word = wordList.get(startIndex);
        for (int i = 0; i < word.length(); i++) {
            backTrack(
                digit, wordList, result, curr + word.charAt(i), startIndex + 1);
        }
    }

    private void set(Map<String, String> map) {
        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");
    }
}
