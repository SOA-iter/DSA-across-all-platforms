class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;
        int low=1;
        int high=x/2;
        int ans=0;
        while(low<=high){
            long mid=low+(high-low)/2;
            if(mid*mid<=x){
                ans=(int)mid;
                low=(int) mid+1;
            }else{
                high=(int)mid-1;
            }
        }
        return ans;
    }
}