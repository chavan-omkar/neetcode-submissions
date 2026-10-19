class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.isEmpty()){
            return 0;
        }
        int left = 0;
        int right = 0;
        int maxLen = 0;
        int n = s.length();

    int[] lastSeenIndex = new int[128];
    // Arrays.fill(lastSeenIndex,-1);

    while(right < n){

        char c = s.charAt(right);
        lastSeenIndex[c]++;

        while(lastSeenIndex[c] > 1){
            lastSeenIndex[s.charAt(left)]--;
            left++;
        }

        
        
        maxLen = Math.max(maxLen, right-left+1);
        
        right++;
    }
return maxLen;


        /*
        Map<Character,Integer>map = new HashMap<>();
        int maxLen = 0;

        while(right < n){
            char c = s.charAt(right);

            if(map.containsKey(c) && map.get(c) >= left){
                left = map.get(c)+1;
               
            }
                maxLen = Math.max(maxLen,right-left+1);
        

            map.put(c,right);
            right++;

        }

        return maxLen;
        */
        
    }
}
