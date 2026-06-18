class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
           for(int c:nums){
            map.put(c,map.getOrDefault(c,0)+1);
           }
           int ans=0;
           for(int c : map.keySet()){
            if(map.get(c)>nums.length/2)
            ans=c;
           }
    return ans;}
}