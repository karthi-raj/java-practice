import java.util.Scanner;

public class Main7 {

    static int stack[] = new int[100];
    static int top = -1;

  
    static void push(int value) {
       stack[++top] = value;
    }

 
    static int pop() {
       return stack[top--];
    }

    static int evaluatePostfix(String exp) {

       for (int i = 0; i < exp.length(); i++) {

            char ch = exp.charAt(i);

            
            if (Character.isDigit(ch)) {
                push(ch -'0');   
            }

          
            else {
                int val2 = pop();
                int val1 = pop();

                switch (ch) {
                   case '+':
                      push(val1 + val2);
                   break;
                    
                   case '-':
                      push(val1 - val2);
                   break;
                    
                   case '*':
                      push(val1 * val2);
                   break;
                    
                   case '/':
                      push(val1 / val2); 
                   break;
                }
            }
       }

       return pop();
    }

   public static void main(String[]args){
       Scanner sc = new Scanner(System.in);

       String exp = sc.next();  

       int R = evaluatePostfix(exp);

       System.out.println(R);
    }
}