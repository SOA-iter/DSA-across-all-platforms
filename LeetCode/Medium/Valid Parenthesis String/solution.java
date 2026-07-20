class Solution {
    public boolean checkValidString(String s) {
        int minopen=0,maxopen=0;
        for(char ch: s.toCharArray()){
            if(ch=='('){
                minopen++;
                maxopen++;
            }else if(ch==')'){
                minopen--;
                maxopen--;
            } else if(ch=='*'){
                 minopen--;
                maxopen++;
            }
            if (maxopen < 0) {
                return false;
            }

            // minOpen cannot be negative (we reset it to 0)
            if (minopen < 0) {
                minopen = 0;
            }
        }

        // The string is valid if we can successfully pair all brackets (minOpen is 0)
        return minopen == 0;
        
    }
}