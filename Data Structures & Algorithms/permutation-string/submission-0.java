class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left = 0;
        int k = s1.length();
        int n = s2.length();

        if(k > n) return false;

        int[] freq = new int[26];
        int[] window = new int[26];

        for(char c : s1.toCharArray()){
            freq[c - 'a']++;
        }

        for(int i = 0;i<n;i++){
            char incoming = s2.charAt(i);

            window[incoming - 'a']++;

            if(i >=k){
                char outgoing = s2.charAt(i-k);
                window[outgoing-'a']--;
            } 


            if(i >= k-1){
                if(Arrays.equals(freq,window)){
                    return true;
                }
            }
        }

        return false;

        
        
    }
}
