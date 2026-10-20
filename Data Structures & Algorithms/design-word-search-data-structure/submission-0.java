class WordDictionary {
    TrieNode root;

    private static class TrieNode{
        TrieNode[] children;
        boolean isEnd;

        TrieNode(){
            children = new TrieNode[26];
            isEnd = false;
        }
    }

    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode curr = root;
        for(int i = 0;i<word.length();i++){
            int ind = word.charAt(i)-'a';
            if(curr.children[ind]== null){
                curr.children[ind] = new TrieNode();
            }
            curr = curr.children[ind];
        }
        curr.isEnd = true;

    }

    public boolean search(String word) {
        return searchInNodes(word,0,root);
    }

    private boolean searchInNodes(String word,int startIndex,TrieNode node){
        if(startIndex == word.length()) return node.isEnd;

        char c = word.charAt(startIndex);

        if(c != '.'){
                int index = c-'a';
                if(node.children[index] == null){
                    return false;
                }
            
            return searchInNodes(word,startIndex+1,node.children[index]);
        }else{

            for(int i =0;i<26;i++){
                if(node.children[i] != null){
                    if(searchInNodes(word,startIndex+1,node.children[i])){
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
