public class Array {
    int [] arr;
    int size;
    int capacity;

    Array(int capacity){
        arr = new int[capacity];
        this.capacity = capacity;
        size = 0;
    }

    boolean insert (int index, int element){

        if(size < 0 || size >= capacity || index > size){
            System.out.println("Array is Full or Invalid Index");
            return false;    
        }
        for (int i = size ; i>index ; i--){
            arr[i] = arr[i-1];
        }
        arr[index] = element;
        size++;
        return true;
    }

    void display(){
        for (int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }

    int get(int index){
        if (index < 0 || index >= size){
            System.out.println("Invalid Index");
            return -999;
        }
        return arr[index];
    }

    void set(int index, int element){
        if (index < 0 || index >= size){
            System.out.println("Invalid Index");
        }
        arr[index]= element;
    }

    int search (int element){
        for (int i=0; i<size; i++){
            if (arr[i] == element){
                return i;
            }
        }
        return -1;
    }

    boolean delete (int index){
        if(index < 0 || index >= size){
            System.out.println("Can't Delete : Invalid Index");
            return false;
        }
        for (int i=index; i<size-1; i++){
            arr[i] = arr[i+1];
        }
        size--;
        return true;
    }

    public static void main(String [] args){
        Array arrey = new Array(10);
        System.out.println(arrey.capacity);

        arrey.insert(0,15);
        arrey.insert(1,25);

        arrey.get(0);
        arrey.set(1,100);
        System.out.println(arrey.search(100));
        arrey.display();
    }    
}
