class Solution {
    public String frequencySort(String s) {
        // Step 1: Count frequencies
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        List<Map.Entry<Character,Integer>>entrylist=new ArrayList<>(freq.entrySet());
        entrylist.sort((e1,e2)->e2.getValue()-e1.getValue());

        StringBuilder sb=new StringBuilder();
        for(Map.Entry<Character, Integer> entry : entrylist){
            char ch = entry.getKey();
            int count = entry.getValue();
            for (int i = 0; i < count; i++) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
