class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i = 0; // Pointer for str1 (the big boss)
        int j = 0; // Pointer for str2 (the target subsequence)
        
        int n1 = str1.length();
        int n2 = str2.length();
        
        // We keep walking as long as both pointers are in bounds! 🚶‍♂️🚶‍♀️
        while (i < n1 && j < n2) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(j);
            
            // Check if they match naturally OR after a cyclic glow-up! 🌟
            if (c1 == c2 || (c1 - 'a' + 1) % 26 == (c2 - 'a')) {
                j++; // We found a match! Move the str2 pointer to the next target!
            }
            
            // We ALWAYS move the str1 pointer forward, no matter what! 
            i++; 
        }
        
        // If our str2 pointer reached the very end, we successfully matched everything! 🎉
        return j == n2;
    }
}