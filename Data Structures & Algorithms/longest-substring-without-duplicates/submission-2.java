class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.isEmpty()) return 0;

 int n = s.length()-1;
        Map<Character, Integer> map = new HashMap<>(n);
        int maxLength = 0;
        int cnt =0;
        int l = 0;
        int r = 0;
        

        while(r <= n){
            char c = s.charAt(r);

            if(map.containsKey(c)){
                l = Math.max(l,map.get(c)+1);
            }

            map.put(c,r);
            maxLength = Math.max(maxLength,r-l+1);
            r++;
        }
       

        
        return maxLength;

        
    }
}
