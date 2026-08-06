import java.util.Arrays;

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int maxpile = Arrays.stream(piles).max().getAsInt();
        int high = maxpile;
        int ans = maxpile;

        while (low <= high) {
            int mid = low + (high - low) / 2; 
            long totalHrs = gethours(piles, mid);

            if (totalHrs <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    public long gethours(int[] piles, int speed) {
        long totalhours = 0;
        for (int bananas : piles) {
            
            totalhours += (long) Math.ceil((double) bananas / speed);
        }
        return totalhours;
    }
}