class Solution {
    public long cal(int piles[],int hour){
        long total=0;
        for(int i=0;i<piles.length;i++){
          total+=(int)Math.ceil((double)piles[i]/hour);
        }
        return total;
    }
    public int minEatingSpeed(int[] piles, int h) {
      int max=Arrays.stream(piles).max().getAsInt();
    int low =1;
    int high=max;
    int anss=Integer.MAX_VALUE;
    while(low<=high){
        int mid=(low+high)/2;
        long ans=cal(piles,mid);
        if(ans<=h){
            anss=mid;
            high=mid-1;
        }
        else{
            low=mid+1;
        }
    }
     return anss;   
    }
}