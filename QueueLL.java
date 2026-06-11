public class QueueLL {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    Node front , rear;
    QueueLL(){
        front = null;
        rear = null;
    }

    void enqueue(int data){
        Node newNode = new Node(data);
        if(front == null){
            front = newNode;
            rear = newNode;
        }
        rear.next = newNode;
        rear = newNode;
    }

    int dequeue(){
        if(front == null){
            throw new IndexOutOfBoundsException("queue is Empty");
        }
        int temp = front.data;
        front = front.next;
        return temp;
    }


    public static void main(String [] args){
        QueueLL ql = new QueueLL();
        ql.enqueue(5);
        ql.enqueue(1);
        ql.enqueue(7);
        ql.enqueue(9);
        System.out.println(ql.dequeue());
        System.out.println(ql.dequeue());
        System.out.println(ql.dequeue());
    }
}
