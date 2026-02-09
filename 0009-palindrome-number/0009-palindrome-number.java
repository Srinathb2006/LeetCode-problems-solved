class Solution {
    public boolean isPalindrome(int x) {
        int dup=0;
        int og=x;
        while(x>0){
            int d=x%10;
           
            dup=dup*10+d;
             x=x/10;
        }
        if(dup==og)
        return true;
        else
        return false;
    }
}