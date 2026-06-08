class CircularLinkedList <T> {
    class Node{
        T data;
        Node next;

        Node(T data){
            this.data = data;
            this.next = null;
        }
    }

    Node tail;

    CircularLinkedList(){
        tail = null;
    }

    void InsertAtBeginning(T data){
        Node newNode = new Node(data);
        if(tail == null){
            newNode.next = newNode;
            tail = newNode;
        }
        else{
            newNode.next = tail.next;
            tail.next = newNode;
        }
    }

    void InsertEnd(T data){
        Node newNode = new Node(data);
        if(tail == null){
            newNode.next = newNode;
            tail = newNode;
        }
        else{
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
    }

    void DeleteAtBeginning(){
        if(tail == null){
            System.out.println("Empty List");
            return;
        }
        if(tail.next == tail){
            tail = null;
            return;
        }
        else{
            tail.next = tail.next.next;
        }
    }

    void DeleteAtEnd(){
        if(tail == null){
            System.out.println("Empty List");
            return;
        }
        if(tail.next == tail){
            tail = null;
            return;
        }
        Node temp = tail;
        while(temp.next != tail){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        tail = temp;
    }


    void display(){
        Node temp = tail.next;
        System.out.println();
        do{
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }while(temp != tail.next);
    }


    public static void main(String[] args) {
        CircularLinkedList<Integer> lst = new CircularLinkedList<>();
        lst.InsertEnd(10);
        lst.InsertEnd(20);
        lst.InsertEnd(30);
        lst.display();
        lst.InsertAtBeginning(40);
        lst.display();
        lst.DeleteAtBeginning();
        lst.display();
        lst.DeleteAtEnd();
        lst.display();
    }
}