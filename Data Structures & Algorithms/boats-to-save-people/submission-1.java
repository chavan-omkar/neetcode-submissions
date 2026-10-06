class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int count = 0;
        int l = 0;
        int r = people.length-1;
        Arrays.sort(people);

        while(l<=r){
            int sum = people[l] + people[r];
            if(sum <= limit){
                l++;
                
            }
            r--;

            count++;

            

        }

        return count;

        
    }
}