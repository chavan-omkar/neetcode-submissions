class Solution {
    public boolean isPalindrome(String s) {

        int left = 0;
        int right =s.length()-1;

        while(left < right){
            char l1 = Character.toLowerCase(s.charAt(left));
            char r1 = Character.toLowerCase(s.charAt(right));
            if(!Character.isLetterOrDigit(l1)){
            left++;
            continue;
            }
            if(!Character.isLetterOrDigit(r1)){
            right--;
            continue;
            }

            if(l1 != r1){
                return false;
            }

            left++;
            right--;
        }

        return true;
        
    }
}
