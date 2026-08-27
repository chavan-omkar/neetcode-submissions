class Solution {
    public String encode(List<String> strs) {
        StringBuilder ans = new StringBuilder();
        for (String s : strs) {
            ans.append(s.length()).append('#').append(s);
        }

        return ans.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int index = 0;

        while(index < str.length()){
            int j = index;

            while(str.charAt(j) != '#'){
                j++;
            }

            int len = Integer.parseInt(str.substring(index,j));

            int start = j+1;
            int end = start + len;

            ans.add(str.substring(start,end));
            index = end;
        }
        return ans;
        
    }
}
