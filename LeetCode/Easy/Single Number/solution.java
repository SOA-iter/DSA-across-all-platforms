class Solution {
    public int singleNumber(int[] nums) {
       int xor=0;
       for(int arr:nums){
        xor=xor^arr;
       }
       return xor; 
    }
}