class Node{
    int data;
    Node prev;
    Node next;

    Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}


class DoubleLinkedList {
    Node head = null;

    void InsertBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    void InsertEnd(int data) {
        if (head == null) {
            InsertBeginning(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    void InsertIndex(int index, int data){
        if(index < 0){
            System.out.println("Invalid Insertion: Cannot Insert data");
        }
        Node temp = head;
        for (int i=0; i<index-1; i++){
            temp = temp.next;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
        newNode.next.prev = newNode;
    }

    void delete(int data){
        Node temp = head;
        if(head.data == data){
            head = head.next;
            return;
        }
        while(temp.next != null && temp.next.data != data){
            temp = temp.next;
        }
        if(temp.next == null){
            System.out.println("Invalid Index");
            return;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
    }

    void DeleteIndex(int index){
        if(index < 0){
            System.out.println("Invalid Index");
            return;
        }
        Node temp = head;
        if(index == 0){
            head = head.next;
            return;
        }
        for (int i=0; i<index-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if(temp.next != null){
            temp.next.prev = temp;
        }
    }

    void Search(int data){
        Node temp = head;
        while(temp != null){
            if(temp.data == data){
                System.out.println(true);
                return;
            }
            temp = temp.next;
        }
        System.out.println(false);
    }


    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public static void main (String [] args){
        DoubleLinkedList list = new DoubleLinkedList();
        list.InsertEnd(10);
        list.InsertEnd(20);
        list.InsertEnd(30);
        list.InsertEnd(40);
        list.InsertEnd(50);
        list.display();
        list.delete(30);
        list.display();
        list.DeleteIndex(2);    
        list.display();
        list.DeleteIndex(2);
        list.display();
    }
}
