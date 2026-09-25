class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.isEmpty()){
            return 0;
        }
        int left = 0;
        int right = 0;
        int n = s.length();
        Map<Character,Integer>map = new HashMap<>();
        int maxLen = 0;

        while(right < n){
            char c = s.charAt(right);

            if(map.containsKey(c)){
                left = Math.max(left,map.get(c)+1);
               
            }
                maxLen = Math.max(maxLen,right-left+1);
        

            map.put(c,right);
            right++;

        }

        return maxLen;
        
    }
}
