class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}


public class StackLinkedList {
    
    Node top = null;

    void push(int data){
        Node newNode = new Node(data);
        if(top == null){
            top = newNode;
            return;
        }
        newNode.next = top;
        top = newNode;
    }

    int pop(){
        int temp = top.data;
        top = top.next;
        return temp;
    }

    int peek(){
        return top.data;
    }

    int isEmpty(){
        if(top == null){
            return 1;
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args){
        
        StackLinkedList stack = new StackLinkedList();
        stack.push(6);
        stack.push(8);
        stack.push(3);
        stack.push(5);
        stack.push(9);
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
    }
}
