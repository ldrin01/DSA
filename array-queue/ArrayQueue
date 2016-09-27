/**
* Java implementation of a queue using array.
* For demo purpose, should hold a maximum of 10 integers.
*
* @author  [Eldrin M. Bernardino]
* @link    [https://github.com/ldrin01]
* @version [version number]
* @since   [last updated 28/09/2016]
*/

public class ArrayQueue {
    public int capacity;
    public int last = 0;
    public int[] storage;
    public ArrayQueue(int size){
        capacity = size;
        storage = new int[capacity];
    }
    
    public boolean isFull(){
        if (last == capacity) {
            return true;
        }else{ 
            return false;
        }
    }
    public void enqueue(int value){
        if (isFull()) {
        System.out.println("SORRY THE QUEUE IS FULL. Can't add '"+value+"'");
        System.out.println();
        } else {
        System.out.println("... trying to enqueue on queue[" + last + "] ...");
        storage[last] = value;
        last += 1;
        System.out.println(value + " was successfully added.");
        System.out.println();
        }
    }
    public boolean isEmpty(){
        if (storage[0] == 0) {
          return true;
        } 
        return false;
    }
    public void dequeue(){
        if (isEmpty()) {
            System.out.println("SORRY THE QUEUE IS EMPTY. Can't remove element");
            System.out.println();
        } else {
            System.out.println("... trying to dequeue queue[0] ...");
            int temporary = storage[0];
            last -= 1;
            for(int i = 0; i < last; i++){
                storage[i] = storage[i+1];
            }
            storage[last]=0;
            System.out.println(temporary + " was successfully removed.");
            System.out.println();
        }
        
    }
    public void show(){
        for (int i = 0; i < capacity; i++) {
            System.out.println("    queue["+i+"] = " + storage[i]);
        }
        System.out.println();
    }
    public void peek(){
        if(isEmpty()){
            System.out.println("SORRY THE QUEUE IS EMPTY. There's no peek");
            System.out.println();
        }else{
            System.out.println("PEEK queue["+(last-1)+"] = " + storage[last-1]);
            System.out.println();
        }
    }
    public void front(){
        if(isEmpty()){
            System.out.println("SORRY THE QUEUE IS EMPTY. There's no front");
            System.out.println();
        }else{
            System.out.println("FRONT queue[0] = " + storage[0]);
            System.out.println();
        }
    }
    
    
    public static void main(String[]args){
        ArrayQueue call = new ArrayQueue(10);
    System.out.println("STORAGE CAPACITY = " + call.capacity);
    System.out.println();
    
    call.show();
    call.enqueue(12);
    call.enqueue(23);
    call.enqueue(34);
    call.enqueue(45);
    call.enqueue(67);
    call.enqueue(78);
    call.enqueue(89);
    call.enqueue(90);
    call.enqueue(99);
    call.enqueue(98);
    call.show();
    call.enqueue(87);
    call.dequeue();
    call.peek();
    call.front();
    call.dequeue();
    call.dequeue();
    call.dequeue();
    call.dequeue();
    call.dequeue();
    call.dequeue();
    call.dequeue();
    call.dequeue();
    call.dequeue();
    call.show();
    call.dequeue();
    }
}
