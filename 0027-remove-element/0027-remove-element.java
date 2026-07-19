class Solution {
    public int removeElement(int[] nums, int val) {
        int low = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                int temp = nums[low];
                nums[low] = nums[j];
                nums[j] = temp;
                low++;
            }
        }
        return low;
    }
}