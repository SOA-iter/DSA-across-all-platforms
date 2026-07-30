class Solution {
    public int findTarget(int arr[], int target) {
        // code here
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]==target){
                return m;
            }
            else if(m-1>=s && arr[m-1]==target){
                return m-1;
            }else if(m+1<=e && arr[m+1]==target){
                return m+1;
            }
            else if(arr[m]<target){
                s=m+2;
            }else{
                e=m-2;
            }
        }
        return -1;
    }
}