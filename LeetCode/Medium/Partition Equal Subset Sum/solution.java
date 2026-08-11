class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        if(sum%2!=0) return false;
        return subsetsum(nums,sum/2,n);
    }
    public boolean subsetsum(int arr[],int sum,int n){
            boolean t[][]=new boolean[n+1][sum+1];
            for(int i=0;i<=n;i++){
                t[i][0]=true;
            }
            for(int j=1;j<=sum;j++){
                t[0][j]=false;
            }
            for(int i=1;i<=n;i++){
                for(int j=1;j<=sum;j++){
                    if(arr[i-1]<=j){
                        t[i][j]=t[i-1][j-arr[i-1]]||t[i-1][j];
                    }else{
                        t[i][j]=t[i-1][j];
                    }
                }
            }
            return t[n][sum];
    }

}