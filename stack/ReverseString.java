public class ReverseString{

    public static String reverseString(String str){
        Stack stack = new Stack(str.length());
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            stack.push(ch);
        }

        StringBuilder builder = new StringBuilder();

        while(!stack.isEmpty()){
            int pop = stack.pop();
            builder.append((char)pop);
        }
        
        return builder.toString();
    }


    public static void main(String[] args){
       System.out.println(reverseString("amAn"));
    }
}