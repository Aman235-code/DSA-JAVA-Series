public class EvalExp{
    public static int eval(String exp){

        Stack stack = new Stack(exp.length());
        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);
            if(Character.isDigit(ch)){
                System.out.println(ch-'0');
                stack.push(ch-'0');
            }
            else{
                int operand1 = stack.pop();
                int operand2 = stack.pop();
                switch(ch){
                    case '+':
                        stack.push(operand2 + operand1);
                        break;
                    case '-':
                        stack.push(operand2 - operand1);
                        break;
                    case '*':
                        stack.push(operand2 * operand1);
                        break;
                    case '/':
                        stack.push(operand2 / operand1);
                        break;
                    default:
                        System.out.println("Invalid operator");
                }
            }
        }
        int res = stack.pop();
        return res;
    }

    public static void main(String[] args){
        System.out.println(eval("23+"));
    }
}