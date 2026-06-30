class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        
        int minwindow = Integer.MAX_VALUE;
        int currentsum=0;
        for(int right=0;right<nums.length;right++){
          currentsum+=nums[right];

          while(currentsum>=target){
        int currentwindowsize = right-left+1;
            minwindow = Math.min(currentwindowsize,minwindow);
            currentsum=currentsum-nums[left];
            left++;
          }

        }
             return minwindow==Integer.MAX_VALUE?0:minwindow;
    }
}