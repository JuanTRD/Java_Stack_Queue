package src;

import java.util.EmptyStackException;
import java.util.LinkedList;



public class MyGenericStack<T> implements GenericStackClient{
    private LinkedList<T> Stack;
    public MyGenericStack(){
        this.Stack = new LinkedList();
    }
    @Override
    public void stackOfString() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of stack after push operation: " + stack.size());
        System.out.printf("1.2 Pop element from stack: ");
        while(!stack.isEmpty()){
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n1.3 Size of stack after pop operation: " + stack.size());
    }

    @Override
    public void stackOfInteger() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("1.1 Size of stack after push operation: " + stack.size());
        System.out.printf("1.2 Pop element from stack: ");
        while(!stack.isEmpty()){
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n1.3 Size of stack after pop operation: " + stack.size());
    }
    public void push(T element) {
        this.Stack.addFirst(element);
    }
    public T pop(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return this.Stack.removeFirst();
    }
    public int size() {
        return Stack.size();
    }
    public boolean isEmpty() {
        if (Stack.size() == 0){
            return true;
        } else return false;
    }
}
