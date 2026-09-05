class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        // Use TreeMap to keep elements sorted in ascending order
        Map<Integer, Integer> map = new TreeMap<>();

        // Count frequencies
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Add entrySet values to ArrayList<ArrayList<Integer>>
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ArrayList<Integer> pair = new ArrayList<>();
            pair.add(entry.getKey());
            pair.add(entry.getValue());
            res.add(pair);
        }

        return res;
    }
}