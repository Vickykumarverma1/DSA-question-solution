class Solution {
    public int totalFruit(int[] fruits) {
        int low = 0;
        int currlen = 0;
        int res = 0;
        int n = fruits.length;
        int[] freq = new int[n];
        int unique = 0;
        for(int high = 0; high<n; high++)
        {
            int r = fruits[high];
            if(freq[r]==0) unique++;
            freq[r]++;
            while(unique>2)
            {
                int l = fruits[low];
                freq[l]--;
                if(freq[l]==0) unique--;
                low++;
            }
           
                currlen = high-low+1;
                res = Math.max(currlen,res);
            
        }
        return res;
    }
}