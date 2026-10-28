class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] freq = new int[128];

        for(int i = 0;i < s.length();i++){
            freq[s.charAt(i)]++;
            freq[t.charAt(i)]--;
        }

        for(int num : freq){
            if(num != 0){
                return false;
            }
        }

        return true;
    /*
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(char c : t.toCharArray()){
            if(!map.containsKey(c)){
                return false;
            }else{
                map.put(c,map.get(c)-1);

                if(map.get(c)==0){
                    map.remove(c);
                }
            }
        }
        return map.isEmpty();

        */

    }
}
