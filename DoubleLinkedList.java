class circularLinkedList <T> {
    class Node{
        T data;
        Node next;
        Node(T data){
            this.data = data;
            this.next = null;
        }
    }

    Node tail;

    circularLinkedList(){
        tail = null;
    }

    void InsertAtBeginning(T data){
        Node newNode = new Node(data);
        if(tail == null){
            tail = newNode;
            newNode.next = newNode;
        }
        else{
            newNode.next = tail.next;
            tail.next = newNode;
        }
    }

    void InsertAtEnd(T data){
        Node newNode  = new Node(data);
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

    void display(){
        if(tail == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = tail.next;
        System.out.println();
        do{
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        while(temp != tail.next);
        System.out.println();
    }

    public static void main(String[] args) {
        circularLinkedList<Integer> lst = new circularLinkedList<>();
        lst.InsertAtBeginning(10);
        lst.InsertAtBeginning(20);
        lst.InsertAtBeginning(30);
        lst.display();
        lst.InsertAtEnd(40);
        lst.display();
    }
}