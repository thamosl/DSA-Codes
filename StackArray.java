public class StackArray{

    int size;
    int [] stack;
    int top = -1;

    StackArray(){
        size = 100;
        stack = new int[size];
    }

    void push(int data){
        if(top == size-1){
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = data;
    }

    int pop(){
        return stack[top--];
    }

    int peek(){
        return stack[top];
    }

    int isempty(){
        if (top == -1){
            return 1;
        }
        else{
            return 0;
        }
    }


    public static void main(String [] args){
        StackArray stack = new StackArray();
        stack.push(6);
        stack.push(8);
        stack.push(3);
        stack.push(5);
        stack.push(9);
        System.out.println(stack.pop());
        System.out.println(stack.isempty());
        System.out.println(stack.peek());
    }
}
