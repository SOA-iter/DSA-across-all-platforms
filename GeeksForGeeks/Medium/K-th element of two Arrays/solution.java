class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int m=a.length;
        int n=b.length;
        if(m>n){
            return kthElement(b,a,k);
        }
        int left=k;
        int low=Math.max(0,k-n);
        int high=Math.min(k,m);
        while(low<=high){
            int mid1=low+(high-low)/2;
            int mid2 = left - mid1;
             // Boundary elements
            int l1 = (mid1 == 0) ? Integer.MIN_VALUE : a[mid1 - 1];
            int l2 = (mid2 == 0) ? Integer.MIN_VALUE : b[mid2 - 1];

            int r1 = (mid1 == m) ? Integer.MAX_VALUE : a[mid1];
            int r2 = (mid2 == n) ? Integer.MAX_VALUE : b[mid2];

            // Correct partition
            if (l1 <= r2 && l2 <= r1) {
                return Math.max(l1, l2);
            }

            // Took too many elements from a
            if (l1 > r2) {
                high = mid1 - 1;
            }

            // Took too few elements from a
            else {
                low = mid1 + 1;
            }
        }
        return -1;
    }
}