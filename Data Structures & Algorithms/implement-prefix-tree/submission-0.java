class PrefixTree {
    TrieNode root;
    private static class TrieNode {
        TrieNode[] children;
        boolean isEnd;

        TrieNode() {
            children = new TrieNode[26];
            isEnd = false;
        }
    }
    public PrefixTree() {
        root = new TrieNode();
       
    }

    public void insert(String word) {
        TrieNode curr = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';

            if (curr.children[index] == null) {
                curr.children[index] = new TrieNode();
            }
            curr = curr.children[index];
        }
        curr.isEnd = true;
    }

    public boolean search(String word) {
        TrieNode node = searchPrefix(word);
        return node != null && node.isEnd;
    }

    public boolean startsWith(String prefix) {
       return searchPrefix(prefix) != null;
        
    }

    private TrieNode searchPrefix(String str) {
        TrieNode curr = root;
        for (int i = 0; i < str.length(); i++) {
            int ind = str.charAt(i) - 'a';

            if (curr.children[ind] == null)
                return null;

            curr = curr.children[ind];
        }
        return curr;
    }
}
