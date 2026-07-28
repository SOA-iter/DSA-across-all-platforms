class Solution {
    public static int minCost(int[] arr) {
        // code here
        if(arr.length==1) return 0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int res=0;
        for(int num:arr){
            pq.offer(num);
        }
        while(pq.size()>1){
            int first=pq.poll();
            int second=pq.poll();
            res+=first+second;
            pq.offer(first+second);
        }
        return res;
    }
}