class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        long bob = 0;
        long alice = 0;
        for(int i =0; i < aliceSizes.length; i++)
        {
            alice = alice + aliceSizes[i];
        }
        for(int i = 0; i < bobSizes.length; i++)
        {
            bob = bob + bobSizes[i]; 
        }
        long diff = (alice - bob)/2;
        HashSet<Integer> set = new HashSet<>();
        for (int b : bobSizes) {
            set.add(b);
        }
        for (int a : aliceSizes) 
        {
            int target = (int)(a - diff);
            if (set.contains(target)) {
                return new int[]{a, target};
        }
        }
        return new int[]{};

    }

}