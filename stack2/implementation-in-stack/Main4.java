import java.util.Scanner;

class Stack {
    char arr[];
    int top;

    Stack(int size) {
        arr = new char[size];
        top = -1;
    }

    void push(char c) {
        arr[++top] = c;
    }

    char pop() {
        return arr[top--];
    }

    char peek() {
        return arr[top];
    }

    boolean isEmpty() {
        return top == -1;
    }
}

public class InfixToPostfix {

    static int precedence(char ch) {
        if (ch == '+' || ch == '-')
            return 1;
        else if (ch == '*' || ch == '/')
            return 2;
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Infix Expression:");
        String exp = sc.nextLine();

        Stack stack = new Stack(exp.length());
        String postfix = "";

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            
            if (Character.isLetterOrDigit(ch)) {
                postfix += ch;
            }

            
            else if (ch == '(') {
                stack.push(ch);
            }


            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix += stack.pop();
                }
                stack.pop(); 
            }

            
            else {
                while (!stack.isEmpty() && 
                       precedence(stack.peek()) >= precedence(ch)) {
                    postfix += stack.pop();
                }
                stack.push(ch);
            }
        }

      
        while (!stack.isEmpty()) {
            postfix += stack.pop();
        }

        System.out.println("Postfix Expression: " + postfix);
    }
}