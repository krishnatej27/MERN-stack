class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> hm=new HashMap<>();
        Stack<Character> stack=new Stack<>();
        hm.put('}','{');
        hm.put(']','[');
        hm.put(')','(');
        for(char c:s.toCharArray()){
            if(hm.containsValue(c)){
                stack.push(c);
            }
            else if(hm.containsKey(c)){
                if(stack.isEmpty() || hm.get(c)!=stack.pop()){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}