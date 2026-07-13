class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int [] newarr = new int[n+m];
        int i = 0;
        int j = 0;
        int index = 0;
        double res = 0;
        int mid = 0;
        while(i<n && j<m)
        {
            if(nums1[i]<nums2[j])
            {
                newarr[index]=nums1[i];
                i++;
                index++;
            }
            else
            {
                newarr[index] = nums2[j];
                j++;
                index++;
            }
        }
        while(i<n)
        {
            newarr[index]=nums1[i];
            i++;
            index++;
        }
        while(j<m)
        {
            newarr[index]=nums2[j];
            j++;
            index++;
        }
        if((n+m)%2 != 0)
        {
             mid = (n+m)/2;
            res = newarr[mid];
            return res;
        }
        mid = (n+m)/2;
        res = (double)(newarr[mid-1]+newarr[mid])/2;
        return res;
    }
}