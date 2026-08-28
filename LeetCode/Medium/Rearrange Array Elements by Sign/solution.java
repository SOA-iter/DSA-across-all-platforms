class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] pos=new int[n/2];
        int[] neg=new int[n/2];
        int p = 0;
        int k = 0;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                pos[p++]=nums[i];
            }else{
                neg[k++]=nums[i];
            }
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < n/2; i++) {
            result[2 * i] = pos[i];       // Even indices: positive
            result[2 * i + 1] = neg[i];   // Odd indices: negative
        }
        return result;
    }
}