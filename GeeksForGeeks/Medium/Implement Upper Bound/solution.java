class Solution {
    int upperBound(int[] arr, int target) {
        // code here
        int n=arr.length;
        int low=0;
        int high=arr.length-1;
        int res=arr.length;
        while(low<=high){
            int mid=high+(low-high)/2;
            if(arr[mid]<=target){
                low=mid+1;
            }
            if(arr[mid]>target){
                res=mid;
                high=mid-1;
            }
        }
        return res;
    }
}
