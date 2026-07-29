class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer>list=new ArrayList<>();
        int first=firstocc(arr,x);
        int last=lastocc(arr,x);
        list.add(first);
        list.add(last);
        return list;
    }
    public int firstocc(int [] arr,int x){
        int l=0,h=arr.length-1,ans=-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(arr[m]==x){
                ans=m;
                h=m-1;
            }else if(arr[m]<x){
                l=m+1;
            }else{
                h=m-1;
            }
        }
        return ans;
    }
    public int lastocc(int[] arr,int x){
        int l=0,h=arr.length-1,ans=-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(arr[m]==x){
                ans=m;
                l=m+1;
            }else if(arr[m]<x){
                l=m+1;
            }else{
                h=m-1;
            }
        }
        return ans;
    }
    
}
