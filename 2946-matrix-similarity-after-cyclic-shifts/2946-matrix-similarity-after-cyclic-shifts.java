class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int m=mat.length;
        int n=mat[0].length;
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=mat[i][j];
            }
        }
        int g=1;
        while(g<=k){
        for(int i=0;i<m;i++){
            if(i%2==0){
                for(int j=0;j<n-1;j++){
                    int temp=arr[i][j];
                    arr[i][j]=arr[i][j+1];
                    arr[i][j+1]=temp;
                }
            }
            else{
                for(int j=n-1;j>=1;j--){
                    int temp=arr[i][j];
                    arr[i][j]=arr[i][j-1];
                    arr[i][j-1]=temp;
                }
            }
        }
        g++;}
    return (Arrays.deepEquals(mat,arr));
        
    }
}