class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        int n=arr.length;
        int res[]=new int[n];
        Stack<Integer>st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i]= -1;
            }else{
                res[i]=st.peek();
            }
            st.push(arr[i]);
        }
       ArrayList<Integer> resultList = new ArrayList<>(n);
        for (int x : res) {
            resultList.add(x);
        }
        
        return resultList;
    }
}