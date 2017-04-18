public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        char temp;
        for(int i=0;i<s.length();i++){
            temp=s.charAt(i);
            if(temp=='(' || temp=='{' || temp=='['){
                stack.push(temp);
            }
            else if(stack.isEmpty() || !isMatch(stack.pop().charValue(),temp)){
                return false;
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
    public boolean isMatch(char in, char temp){
        if((in=='(' && temp==')') || (in=='{' && temp=='}') || (in=='[' && temp==']')){
            return true;
        }
        return false;
    }
}