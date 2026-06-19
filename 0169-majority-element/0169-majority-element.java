class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
           for(int c:nums){
            map.put(c,map.getOrDefault(c,0)+1);
           }
           int ans=0;
           for(HashMap.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()>nums.length/2)
            ans=entry.getKey();
           }
    return ans;}
}