class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low = 0;
        int n = s.length();
        int maxlen = 0;
        HashMap<Character,Integer> counter = new HashMap<>();
        for(int high = 0; high<n; high++)
        {
            char c = s.charAt(high);
            if(counter.containsKey(c))//it will help to find that the c character is present in the mao or not
            {
                low = Math.max(low,counter.get(c) + 1);// if the character is present then this will help to move low at its last occurance
            }
            counter.put(c, high);
            maxlen = Math.max(maxlen,high-low+1);
        }
        return maxlen;
    }
}