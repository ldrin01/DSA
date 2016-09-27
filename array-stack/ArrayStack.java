/**
* Java implementation of a stack using array.
* For demo purpose, should hold a maximum of 10 string values.
*
* @author  [Eldrin M. Bernardino]
* @link    [https://github.com/ldrin01]
* @version [version number]
* @since   [last updated 28/09/2016]
*/

public class ArrayStack {
  private int capacity;
  private int top = 0;
  private int[] storage;
  
  public ArrayStack(int size) {
    capacity = size;
    storage = new int[capacity];
  }

  public void show() {
    for (int i = capacity-1; i >= 0; i--) {
      System.out.println("    stack["+i+"] = " + storage[i] + " value");
    }
    System.out.println();
  }
  
  private boolean isEmpty() {
    if (storage[0] == 0) {
      return true;
    } 
    return false;
  }

  private boolean isFull() {
    if (top == capacity) {
      return true;
    } 
    return false;
  }

  public void push(int value) {
    if (isFull()) {
      System.out.println("SORRY THE STACK IS FULL. Can't push '"+value+"'");
      System.out.println();
    } else {
      System.out.println("... trying to push on stack[" + top + "] ...");
      storage[top] = value;
      top += 1;
      System.out.println(value + " was successfully added.");
      System.out.println();
    }
  }

  public void pop() {
    if (isEmpty()) {
      System.out.println("SORRY THE STACK IS EMPTY. Can't pop element");
      System.out.println();
    } else {
      System.out.println("... trying to pop stack[" + (top-1) + "] ...");
      int temporary = storage[top-1];
      storage[top-1] = 0;
      top -= 1;
      System.out.println(temporary + " was successfully removed.");
      System.out.println();
    }
  }

  public void peek() {
    if (storage[top] == storage[0]) {
      System.out.println("PEEK TOP = " + storage[top]);
      System.out.println();
    } else {
      System.out.println("PEEK TOP = " + storage[top-1]);
      System.out.println();
    }
  }
  
  public static void main(String[] args) {
    ArrayStack call = new ArrayStack(10);
    System.out.println("STORAGE CAPACITY = " + call.capacity);
    System.out.println();

    call.show();
    call.push(12);
    call.push(23);
    call.push(34);
    call.push(45);
    call.push(56);
    call.push(67);
    call.push(78);
    call.push(89);
    call.push(90);
    call.push(99);
    call.show();
    call.push(98);
    call.pop();
    call.peek();
    call.pop();
    call.pop();
    call.pop();
    call.pop();
    call.pop();
    call.pop();
    call.pop();
    call.pop();
    call.pop();
    call.show();
    call.pop();
  }  
}
