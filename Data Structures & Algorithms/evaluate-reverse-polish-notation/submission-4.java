class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        int result = 0;
        int n = tokens.length;

        for (int i = 0; i < n; i++) {
            String c = tokens[i];


            if ( c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/")  ){
                    int b = stack.pop();
                    int a = stack.pop();
                    int op = switch (c) {
                        case "+" -> a+b;
                       case "-" -> a-b;
                       case "*" -> a* b;
                        case"/"->{
                            if(b == 0)
                            throw new ArithmeticException("divide. by 0");
                            yield a/b;
                        }
                        default->throw new IllegalArgumentException();
                    };
                    stack.push(op);
            }else{
                stack.push(Integer.parseInt(c));
            }

        }
        return stack.pop();
    }

    
}
