class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int maxsum = 0;
        for(int i= 0;i<k;i++){
            maxsum+=nums[i];
        }
        int maximum = maxsum;
        for(int i=k;i<nums.length;i++){
           maxsum=maxsum+nums[i]-nums[i-k];
           maximum = Math.max(maxsum,maximum);
        }
        return (double)maximum/k;
    }
}