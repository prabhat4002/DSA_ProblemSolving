class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(st.size()==0 || st.peek()!=ch){
                st.push(ch);
            }else{
                st.pop();
            }
        }
        char [] res=new char [st.size()];
        for(int i=res.length-1;i>=0;i--){
            res[i]=st.pop();
        }
        String finall=new String(res);
        return finall;
        
    }
}