class Solution {
    public int pivotIndex(int[] nums) {
        int left = 0;
        int sum = 0;
        for(int i =0; i<nums.length; i++)
        {
            sum = sum + nums[i];
        }
        int right = 0;
        // prefix + nums[i] + sufix = total sum of the array
        //  right = sum - nums[i] -left;
        for(int i = 0; i<nums.length; i++)
        {
            
            right = sum - nums[i] -left;
            if(left == right)
            {
                return i;
            }
            left = left + nums[i]; 
        }
        return -1;
    }
}