class Solution {
    public int reverse(int x) {
       try{
       boolean isnegative=false;
        if(x<0)
        isnegative=true;
        
        StringBuilder sb=new StringBuilder(String.valueOf(Math.abs((long)x)));
        sb.reverse();
        x =  Integer.parseInt(sb.toString());
        return isnegative?-x:x;}
        catch(Exception e){
            return 0;
        }
    }
}