class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // int low = 0;
        int n = nums.length;
        HashMap<Integer,Integer>freq= new HashMap<>();
        for(int high = 0; high<n; high++)
        {
            if(freq.containsKey(nums[high]))
            {
                int temp = freq.get(nums[high]);
                if(Math.abs(temp-high)<=k)
                {
                    return true;
                }
                else
                {
                    freq.put(nums[high],high);
                }
            }
            freq.put(nums[high],high);
            
        }
        return false;
    }
}