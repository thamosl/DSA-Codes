public class Dynamic_Arr {
    int [] arr;
    int capacity;
    int size;

    Dynamic_Arr (int capacity){
        arr = new int[capacity];
        this.capacity = capacity;
        size=0;
    }

    boolean insert(int index , int element){
        if(index < 0 || index > size){
            System.out.println("Invalid Index");
            return false;
        }
        if (size >= capacity){
            resize();
        }
        for (int i=size; i>index; i--){
            arr[i] = arr[i-1];
        }
        arr[index]=element;
        size++;
        return true;
    }
    
    int search (int element){
        for (int i=0; i<size ;i++){
            if (arr[i] == element){
                return i;
            }
        }
        return -1;
    }

    int get(int index){
        if(index  < 0 || index >= size){
            System.out.println("Invalid Index");
            return -1;
        }
        return arr[index];
    }

    void display(){
        for(int i=0; i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    void set(int index,int element){
        if(index <0 || index >=size){
            System.out.println("Invalid Index");
            return;
        }
        arr[index] = element;
    }

    boolean delete(int index){
        if (index < 0 || index >= size){
            System.out.print("Index Out of Bound: Can't Delete");
            return false;
        }
        for (int i=index ; i<size-1; i++){
            arr[i] = arr[i+1];
        }
        size--;
        return true;
    }

    void resize(){
        int newCapacity = 2*capacity;
        int [] newArr = new int[newCapacity];
        for(int i=0; i<size; i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
        capacity = newCapacity;
    }

    public static void main(String[] args) {
        Dynamic_Arr a = new Dynamic_Arr(5);
        a.insert(0,0);
        a.insert(1,1);
        a.insert(2,2);
        a.insert(3,3);
        a.insert(4,4);
        a.display();
        a.insert(5,5);
        a.display();
        a.delete(5);
        a.display();
        int val = a.get(3);
        System.out.println(val);
    }
}
