class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        ArrayList<Integer> arr=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int key = entry.getKey();
                int count = entry.getValue();
                int times = Math.min(2, count);
                for (int i = 0; i < times; i++) {
                arr.add(key);
            }
}
            for (int i = 0; i < arr.size(); i++) {
            nums[i] = arr.get(i);
        }

        return arr.size();
        
    }
}