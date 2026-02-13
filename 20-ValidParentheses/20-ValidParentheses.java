// Last updated: 2/13/2026, 10:11:47 AM
class Solution {
    public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();   
    
    HashMap<Character, Character> paranthesis = new  HashMap<>();
    paranthesis.put(')', '(');  
    paranthesis.put('}', '{');  
    paranthesis.put(']', '[');  

    if(s.length() % 2 != 0) return false;
    for(char c: s.toCharArray()){
        if(paranthesis.containsKey(c)){
            if(!stack.isEmpty() && stack.peek() == paranthesis.get(c)){
                stack.pop();
            } else{
                return false;
            }
        }
        else{
            stack.push(c);
        }
    }     
    return stack.isEmpty();
    }
}