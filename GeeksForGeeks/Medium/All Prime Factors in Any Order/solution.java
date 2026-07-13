class Solution {
    ArrayList<Integer> primeFactors(int n) {
        ArrayList<Integer> factors=new ArrayList<>();
        // code here
        while(n%2==0){
            factors.add(2);
            n=n/2;
            
        }
        for(int i=3;i * i <= n;i+=2){
            while(n%i==0){
                factors.add(i);
                n=n/i;
            }
        }
        if(n>2){
            factors.add(n);
        }
        return factors;
    }
}
