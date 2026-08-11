class Solution {
    public String removeOuterParentheses(String s) {
        int level=0;
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                level++;
                if(level>1){
                    res.append(ch);
                }
            }else{
                level--;
                if(level>0){
                    res.append(ch);
                }
            }
        }
        return res.toString();
    }
}