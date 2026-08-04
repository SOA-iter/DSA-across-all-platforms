class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[] {first(nums, target )  , second(nums , target)};
    }
    private int first(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        int res=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                res=mid;
                high=mid-1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return res;
    }
    private int second(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        int res=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                res=mid;
                low=mid+1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return res;
    }


}