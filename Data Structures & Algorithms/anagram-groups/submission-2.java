class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map = new HashMap<>();
        for(String str : strs){
            int[] freq = new int[26];

            for(char c : str.toCharArray()){
                freq[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for(int num : freq){
                sb.append('#').append(num);
            }






            String sortKey = sb.toString();



            map.putIfAbsent(sortKey,new ArrayList<>());
             map.get(sortKey).add(str);
        }
        return new ArrayList<>(map.values());
        
    }
}
