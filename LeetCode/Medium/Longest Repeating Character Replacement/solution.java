class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];   // frequency of each character
        int left = 0;               // left pointer of sliding window
        int maxfreq = 0;            // max frequency of a single char in current window
        int maxwindow = 0;          // result: longest valid window

        for (int right = 0; right < s.length(); right++) {
            // include current character
            freq[s.charAt(right) - 'A']++;
            maxfreq = Math.max(maxfreq, freq[s.charAt(right) - 'A']);

            int windowlength = right - left + 1;

            // if replacements needed > k, shrink window
            if (windowlength - maxfreq > k) {
                freq[s.charAt(left) - 'A']--;  // remove left char
                left++;                        // move left pointer
            }

            // update max window length
            windowlength = right - left + 1;
            maxwindow = Math.max(maxwindow, windowlength);
        }
        return maxwindow;
    }
}
