class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head = null;

    void InsertBeginning(int data){
        Node NewNode = new Node(data);
        NewNode.next = head;
        head = NewNode;
    }

    void InsertEnd(int data){
        if (head == null){
            InsertBeginning(data);
        }
        Node NewNode = new Node(data);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = NewNode;
    }

    void InsertIndex(int index, int data){
        if(index < 0){
            System.out.println("Invalid Index: Cannot Insert data");
            return;
        }
        Node temp = head;
        for (int i=0; i<index-1; i++){
            temp = temp.next;
        }
        Node NewNode = new Node(data);
        NewNode.next = temp.next;
        temp.next = NewNode;
    }

    void delete(int data){
        Node temp = head;
        if (head.data == data){
            head = head.next;
            return;
        }
        while (temp.next != null && temp.next.data != data){
            temp = temp.next;
        }
        if(temp.next == null){
            System.out.println("Invalid Index");
            return;
        }
        temp.next = temp.next.next;
    }


    void DeleteIndex(int index){
        Node temp = head;
        if(index <0){
            System.out.println("Invalid Index");
            return;
        }
        if(index == 0){
            head = head.next;
            return;
        }
        for(int i =0; i<index-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    void search(int data){
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
        System.out.println("Null");
    }

    public static void main(String [] args){
        LinkedList List = new LinkedList();
        List.InsertBeginning(10);
        List.InsertBeginning(20);
        List.InsertBeginning(30);
        List.InsertBeginning(40);
        List.display();
        List.InsertBeginning(5);
        List.display();
        List.InsertIndex(2, 60);
        List.display();
        List.delete(30);
        List.display();
        List.DeleteIndex(4);
        List.display();
        List.search(60);
    }
}
