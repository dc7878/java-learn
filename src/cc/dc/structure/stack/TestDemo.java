package cc.dc.structure.stack;

public class TestDemo {
    public static void main(String[] args) {
        String info = "3+(2-5)*6/3";
        test(info);
    }

    private static void test(String info) {
        StringBuffer buffer = new StringBuffer();
        Stack stack = new Stack();
        for (int i = 0; i < info.length(); i++) {
            Character character = info.charAt(i);
            switch (character) {
                case '+':
                case '-':
                    while (stack.size() != 0) {
                        Character temp = (Character) stack.pop();
                        if (temp == '(') {
                            stack.push('(');
                            break;
                        }
                        buffer.append(character);
                    }
                    stack.push(character);
                    break;
                case '*':
                case '/':
                    while (stack.size() != 0) {
                        Character temp = (Character) stack.pop();
                        if (temp == '(' || temp == '+' || temp == '-') {
                            stack.push(temp);
                            break;
                        } else {
                            buffer.append(temp);
                        }
                    }
                    stack.push(character);
                    break;
                case '(':
                    stack.push('(');
                    break;
                case ')':
                    while (stack.size() != 0) {
                        Character temp = (Character) stack.pop();
                        if (temp == '(') {
                            break;
                        } else {
                            buffer.append(temp);
                        }
                    }
                    break;
                default:
                    buffer.append(character);
                    break;
            }
        }
        while (stack.size() != 0) {
            buffer.append(stack.pop());
        }
        System.out.println(buffer.toString());
    }
}
