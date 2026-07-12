class Solution {
    public static int findXOR(int l, int r) {
        // code here
        return func1(l-1)^func1(r);
    }
    public static int func1(int N){
        if(N%4==1){ 
            return 1;
            
        }else if(N%4==2){
            return N+1;
            
        }else if(N%4==3){
            return 0;
        }else{
            return N;
        }
            
        
    }
}