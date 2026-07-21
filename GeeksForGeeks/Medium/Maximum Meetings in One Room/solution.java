class Solution {
    public static ArrayList<Integer> maxMeetings(int[] S, int[] F) {
        int N = S.length;  // derive N directly

        int[][] meet = new int[N][3];
        for (int i = 0; i < N; i++) {
            meet[i][0] = S[i];
            meet[i][1] = F[i];
            meet[i][2] = i + 1;
        }

        Arrays.sort(meet, (a, b) -> a[1] - b[1]);

        ArrayList<Integer> arr = new ArrayList<>();
        int endTime = meet[0][1];
        arr.add(meet[0][2]);

        for (int i = 1; i < N; i++) {
            if (meet[i][0] > endTime) {
                arr.add(meet[i][2]);
                endTime = meet[i][1];
            }
        }

        Collections.sort(arr); // only if problem requires sorted indices
        return arr;
    }
}
