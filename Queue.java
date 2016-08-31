//    DESCRIPTION: 
//
//    A Queue is an ADT (abstract data type) in FIFO order (first in, first out).
//    It has 2 main operations: (1) ENQUEUE for adding, and (2) DEQUEUE for removing elements.
//    It is a protected SINGLY LINKED LIST where Enqueue is on last and Dequeue is on the front of the queue.
//    You may also PEEK to show the last element added and FRONT for first element.
//    Implementation can either be in ARRAY or LINKED LIST.
//    It's algorithmic complexity is CONSTANT or O(1).
//
//    TODO: 
//
//    Implement a Queue using ARRAY that can hold a maximum of 10 string values.
//    Create operations ENQUEUE, DEQUEUE, PEEK, and FRONT.
//    Allow ENQUEUE only if the queue is not yet full.
//    Allow DEQUEUE only if the queue is not yet empty.
//    Allow PEEK to see the last element.
//    Allow FRONT to see the first element.
//    Show the updated ARRAY QUEUE everytime you ENQUEUE or DEQUEUE.
//
//    PSEUDOCODE:
//
//    START PROGRAM
//
//        SET capacity, last, storage[]
//
//        PROCEDURE show
//            FOR EACH element IN queue.capacity
//            PRINT queue[element]
//
//        PROCEDURE isEmpty
//            IF queue[0] == null
//                PRINT queue is empty
//                return TRUE
//
//        PROCEDURE isFull
//            IF last == capacity
//                PRINT queue is full
//                return TRUE
//
//        PROCEDURE enqueue
//            IF isFull
//                PRINT add failed. element did not enqueue.
//            ELSE
//                Queue temp = new Queue(element)
//                temp.next = last
//                last = temp
//
//        PROCEDURE dequeue
//            IF isEmpty
//                PRINT remove failed. no element to dequeue.
//            ELSE
//                temp = last
//                last = top.next
//                remove temp
//
//        PROCEDURE peek
//            IF isEmpty
//                PRINT queue is empty.
//            ELSE 
//                PRINT last
//
//        PROCEDURE front
//            IF isEmpty
//                PRINT queue is empty.
//            ELSE 
//                PRINT 0
//
//        PROCEDURE main
//            show queue is empty
//            enqueue 10 string until queue is full
//            show updated queue
//            try to enqueue again, return error message
//            dequeue last element
//            peek last element
//            front first element
//            dequeue all elements until queue is empty
//            show updated queue
//            try to dequeue again, return error message
//
//    END PROGRAM 
//
//
//    +------------------------------------+
//    | SOURCE CODE: Queue.java            |
//    | AUTHOR NAME: Bernardino, Eldrin M. |
//    | GITHUB URL: github.com/ldrin01     |
//    | LAST UPDATE: 8/22/2016             |
//    +------------------------------------+

public class Queue {
    public int capacity;
    public int last = 0;
    public String[] storage;
    public Queue(int size){
        capacity = size;
        storage = new String[capacity];
    }
    
    public boolean isFull(){
        if (last == capacity) {
            return true;
        }else{ 
            return false;
        }
    }
    public void enqueue(String value){
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
        if (storage[0] == null) {
          return true;
        } 
        return false;
    }
    public void dequeue(){
        if (isEmpty()) {
            System.out.println("SORRY THE QUEUE IS EMPTY");
            System.out.println();
        } else {
            System.out.println("... trying to dequeue queue[0] ...");
            String temporary = storage[0];
            last -= 1;
            for(int i = 0; i < last; i++){
                storage[i] = storage[i+1];
            }
            storage[last]=null;
            System.out.println(temporary + " was successfully removed.");
            System.out.println();
        }
        
    }
    public void show(){
        for (int i = 0; i < capacity; i++) {
            System.out.println("    queue["+i+"] = " + storage[i] + " value");
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
        Queue call = new Queue(10);
    System.out.println("STORAGE CAPACITY = " + call.capacity);
    System.out.println();
    
    call.show();
    call.enqueue("coockie");
    call.enqueue("mermaid man");
    call.enqueue("barnacle boy");
    call.enqueue("elmo");
    call.enqueue("manny");
    call.enqueue("bob the builder");
    call.enqueue("mulan");
    call.enqueue("thomas");
    call.enqueue("squidward");
    call.enqueue("ben 10");
    call.show();
    call.enqueue("thor");
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
