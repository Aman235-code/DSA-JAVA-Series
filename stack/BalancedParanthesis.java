public class BalancedParanthesis{

    public static boolean isBalanced(String exp){
        Stack stack = new Stack(exp.length());
        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else if(ch == ')' || ch == '}' || ch == ']'){
                if(stack.isEmpty()){
                    return false;
                }
                char top = (char)stack.pop();
                if(!isMatching(top, ch)){
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
          
    }

    private static boolean isMatching(char open, char close){
        if(open == '(' && close == ')'){
            return true;
        }
        else if(open == '[' && close == ']'){
            return true;
        }
        else if(open == '{' && close == '}'){
            return true;
        }
        return false;
    }


    public static void main(String[] args){
        System.out.println(isBalanced("[{}]"));
    }
}