class Solution {
    static int toggleBits(int n, int l, int r) {
        // code here
        for(int i=l;i<=r;i++){
            n=n^(1<<(i-1));
        }
        return n;
    }
};