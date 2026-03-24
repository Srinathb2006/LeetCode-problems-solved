class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i<n){
          int  index=nums[i]-1;
            if(nums[index]!=nums[i]){
                int temp=nums[index];
                nums[index]=nums[i];
                nums[i]=temp;
            }
            else{
                i++;
            }
        }
        List<Integer>arr = new ArrayList();
        for(int j=0;j<n;j++){
            if(nums[j]!=j+1){
                arr.add(nums[j]);
            }
        }
        return arr;
    }
}