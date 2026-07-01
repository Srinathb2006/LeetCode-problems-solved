class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        long currsum=0;
        long maxsum=Long.MIN_VALUE;
        for(int i=0;i<k;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
             currsum+=nums[i];

        } 
        if(map.size()==k)
        maxsum=currsum;
        for(int i=k;i<nums.length;i++){
          currsum+=nums[i]-nums[i-k];
          map.put(nums[i-k],map.get(nums[i-k])-1);
          if(map.get(nums[i-k])==0){
            map.remove(nums[i-k]);
          }
          map.put(nums[i],map.getOrDefault(nums[i],0)+1);
          if(map.size()==k)
          maxsum=Math.max(maxsum,currsum);
        }
        return maxsum == Long.MIN_VALUE?0:maxsum;
    }
}