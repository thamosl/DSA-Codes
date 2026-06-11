public class QueueArray1 {
    int [] arr;
    int rear = -1;
    int size = 10;

    QueueArray1(){
        arr = new int[size];
    }

    void enqueue(int data){
        if(rear == size-1){
            throw new IndexOutOfBoundsException("Queue is Full");
        }
        if(rear == -1){
            arr[++rear] = data;
            return;
        }
        arr[++rear] = data;
    }

    int dequeue(){
        if(rear == -1){
            throw new IndexOutOfBoundsException("Queue is Empty");
        }
        int temp = arr[0];
        for (int i=1; i<= rear; i++){
            arr[i-1] = arr[i];
        }
        rear--;
        return temp;
    }

    public static void main(String [] args){
        QueueArray1 arr = new QueueArray1();
        arr.enqueue(3);
        arr.enqueue(6);
        arr.enqueue(2);
        arr.enqueue(0);
        System.out.println(arr.dequeue());
        System.out.println(arr.dequeue());
        System.out.println(arr.dequeue());
    }
}
