class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int l = 1;
        int max = piles[0];

        for (int i = 1; i < piles.length; i++) {
            if (piles[i] > max) {
                max = piles[i];
            }
        }
        while(l<max)
        {
            int mid =  l + (max-l)/2;
            if(canEatall(piles,mid,h))
            {
                max = mid;
            }
            else
            {
                l = mid+1;
            }
        }
        return l;
    }
    boolean canEatall(int [] piles , int mid, int h)
    {
        int actualhour = 0;
        for(int i = 0; i<piles.length; i++)
        {
            int x = piles[i];
            actualhour = actualhour + x/mid;
            if(x%mid != 0)
            {
                actualhour++;
            }
        }
        return actualhour<=h;
    }
}