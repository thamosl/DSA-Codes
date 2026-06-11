public class QueueArray {
    int [] arr;
    int front = -1;
    int rear = -1;
    int size = 10;


    QueueArray(){
        arr = new int[size];
    }
    
    void enqueue(int data){
        if(rear == size-1){
            System.out.println("Queue is Full");
            return;
        }
        if(front == -1 && rear == -1){
            front++;
            arr[++rear] = data;
            return;
        }
        arr[++rear] = data; 
    }

    int dequeue(){
        if(front == -1 && rear == -1 || front > rear){
            System.out.println("Queue is Empty");
            return 0;
        }
        return arr[front++];
        
    }


    public static void main(String [] args){
        QueueArray arr = new QueueArray();
        arr.enqueue(5);
        arr.enqueue(8);
        arr.enqueue(4);
        arr.enqueue(9);
        System.out.println(arr.dequeue());
        System.out.println(arr.dequeue());
        System.out.println(arr.dequeue());
        System.out.println(arr.dequeue());
        System.out.println(arr.dequeue());
    }

}
