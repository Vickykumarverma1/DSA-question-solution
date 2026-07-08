class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int retmaxsum = maxsum(nums);
        int retmin = minsum(nums);
        if (retmaxsum < 0) {
            return retmaxsum;
        }

        return Math.max(retmaxsum, retmin);
        // return Math.max(retmaxsum , retmin);
    }
    int maxsum(int [] nums)
    {
        int bestending = nums[0];
        int ans = nums[0];
        for(int i = 1; i<nums.length; i++)
        {
            int v1 = bestending + nums[i];
            int v2 = nums[i];
            bestending = Math.max(v1 , v2);
            ans = Math.max(ans , bestending);
        }
        return ans;
    }
    int minsum(int[] nums)
    {
        int bestending = nums[0];
        int ans = nums[0];
        int sum = nums[0];
        for(int i = 1; i< nums.length; i++)
        {
            int v1 = bestending + nums[i];
            int v2 = nums[i];
            bestending = Math.min(v1,v2);
            ans = Math.min(ans,bestending);
            sum = sum + nums[i];

        }
        return sum - ans;
    }
}