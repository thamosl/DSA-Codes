public class Bcheck {
    int size;
    char [] stack;
    int top = -1;

    Bcheck(){
        size = 100;
        stack = new char[size];
    }

    void push(char data){
        if(top == size-1){
            System.out.print("stack Overflow");
            return;
        }
        stack[++top] = data;
    }

    char pop(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return '0';
        }
        return stack[top--];
    }

    char peek(){
        return stack[top];
    }

    boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }

    boolean isValid(String exp){
        Bcheck stack = new Bcheck();
        for(char c: exp.toCharArray()){
            if(c == '{' || c == '[' || c == '('){
                stack.push(c);
            }
            else if(c == '}' || c == ']' || c == ')'){
                if(stack.isEmpty()){
                    return false;
                }
                char current = stack.pop();
                if (current == '{' && c != '}' ||
                    current == ']' && c != ']' ||
                    current == '(' && c != ')'
                ){
                return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }


    public static void main(String [] args){
        Bcheck st = new Bcheck();
        System.out.println(st.isValid("{(a*[4+5])}"));
    }
}
