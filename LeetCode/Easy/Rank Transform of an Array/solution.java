class Solution {
    public int[] arrayRankTransform(int[] arr) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int num:arr){
            pq.offer(num);
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        int rank=1;
        while(!pq.isEmpty()){
            int curr=pq.poll();
            if(!map.containsKey(curr)){
                map.put(curr,rank);
                rank++;
            }
        }
        int[] ans=new int[arr.length];
        for(int i=0;i<ans.length;i++){
            ans[i]=map.get(arr[i]);
        }
        return ans;
    }
}