class Solution {
    public void nearlySorted(int[] arr, int k) {
        // code here
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int count=0;
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
            if(pq.size()>k){
                arr[count]=pq.poll();
                count++;
            }
        }
        while(pq.size()>0){
            arr[count]=pq.poll();
            count++;
        }
    
    }
}
