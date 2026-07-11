class Solution {
    int replaceBit(int n, int k) {
        // code here
        int bits=Integer.toBinaryString(n).length();
        if(k>bits){
            return n;
        }
        int pos=bits-k;
        return (n&~(1<<pos));
    }
}