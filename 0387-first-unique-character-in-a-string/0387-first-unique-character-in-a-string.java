class Solution {
    public int firstUniqChar(String s) {
         int ans=-1;
        for(char c : s.toCharArray()){
            if(s.indexOf(c)==s.lastIndexOf(c))
            {
                 ans = s.indexOf(c);
                break;

            }
        }
        return ans;
    }
}