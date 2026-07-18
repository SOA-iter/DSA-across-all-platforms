class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums==null||nums.length==0) return 0;
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int longeststreak=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int currnum=num;
                int currstreak=1;
                while(set.contains(currnum+1)){
                    currnum=currnum+1;
                    currstreak++;
                }
                longeststreak=Math.max(currstreak,longeststreak);
            }
        }
        return longeststreak;
    }
}