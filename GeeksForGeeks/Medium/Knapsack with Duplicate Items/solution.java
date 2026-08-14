class Solution {
    public int knapSack(int val[], int wt[], int capacity) {
        // code here
        int n=wt.length;
        int[][] t=new int[n+1][capacity+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=capacity;j++){
                if(wt[i-1]<=j){
                    t[i][j]=Math.max(val[i-1]+t[i][j-wt[i-1]],t[i-1][j]);
                }else{
                    t[i][j]=t[i-1][j];
                }
            }
        }
        return t[n][capacity];
    }
}