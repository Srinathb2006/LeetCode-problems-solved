class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
       StringBuilder sb = new StringBuilder(str);
       sb.reverse();
       return str.equals(sb.toString());
    }
}