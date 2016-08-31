//    DESCRIPTION: 
//
//    A STACK is an ADT (abstract data type) in LIFO order (last in, first out).
//    It has 2 main operations: (1) PUSH for adding, and (2) POP for removing elements.
//    It is a protected SINGLY LINKED LIST where PUSH and POP are only allowed on the top front or last element in the stack.
//    You may also PEEK to show the last element added.
//    Implementation can either be in ARRAY or LINKED LIST.
//    It's algorithmic complexity is CONSTANT or O(1).
//
//    TODO: 
//
//    Implement a STACK using ARRAY that can hold a maximum of 10 string values.
//    Create operations PUSH, POP, and PEEK.
//    Allow PUSH only if the stack is not yet full.
//    Allow POP only if the stack is not yet empty.
//    Allow PEEK to see the topmost element.
//    Show the updated ARRAY STACK everytime you PUSH or POP.
//
//    PSEUDOCODE:
//
//    START PROGRAM
//
//        SET capacity, top, storage[]
//
//        PROCEDURE show
//            FOR EACH element IN stack.capacity
//            PRINT stack[element]
//
//        PROCEDURE isEmpty
//            IF stack[0] == null
//                PRINT stack is empty
//                return TRUE
//
//        PROCEDURE isFull
//            IF top == capacity
//                PRINT stack is full
//                return TRUE
//
//        PROCEDURE push
//            IF isFull
//                PRINT add failed. element did not push.
//            ELSE
//                Stack temp = new Stack(element)
//                temp.next = top
//                top = temp
//
//        PROCEDURE pop
//            IF isEmpty
//                PRINT remove failed. no element to pop.
//            ELSE
//                temp = top
//                top = top.next
//                remove temp
//
//        PROCEDURE peek
//            IF isEmpty
//                PRINT stack is empty
//            ELSE 
//                PRINT top
//
//        PROCEDURE main
//            show stack is empty
//            push 10 string until stack is full
//            show updated stack
//            try to push again, return error message
//            pop last element
//            peek last element
//            pop all elements until stack is empty
//            show updated stack
//            try to pop again, return error message
//
//    END PROGRAM 
//
//
//    +------------------------------------+
//    | SOURCE CODE: Stack.java            |
//    | AUTHOR NAME: Bernardino, Eldrin M. |
//    | GITHUB URL: github.com/ldrin01     |
//    | LAST UPDATE: 8/22/2016             |
//    +------------------------------------+

public class Stack {
  private int capacity;
  private int top = 0;
  private String[] storage;
  
  public Stack(int size) {
    capacity = size;
    storage = new String[capacity];
  }

  public void show() {
    for (int i = capacity-1; i >= 0; i--) {
      System.out.println("    stack["+i+"] = " + storage[i] + " value");
    }
    System.out.println();
  }
  
  private boolean isEmpty() {
    if (storage[0] == null) {
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

  public void push(String value) {
    if (isFull()) {
      System.out.println("SORRY THE STACK IS FULL. Can't add '"+value+"'");
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
      System.out.println("SORRY THE STACK IS EMPTY");
      System.out.println();
    } else {
      System.out.println("... trying to pop stack[" + (top-1) + "] ...");
      String temporary = storage[top-1];
      storage[top-1] = null;
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
    Stack call = new Stack(10);
    System.out.println("STORAGE CAPACITY = " + call.capacity);
    System.out.println();

    call.show();
    call.push("coockie monster");
    call.push("mermaid man");
    call.push("barnacle boy");
    call.push("elmo");
    call.push("manny");
    call.push("bob the builder");
    call.push("mulan");
    call.push("thomas");
    call.push("squidward");
    call.push("ben 10");
    call.show();
    call.push("thor");
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
