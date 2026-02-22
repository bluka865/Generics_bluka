package bluka;
/**
 * Generic Stack class implementing LIFO (Last-In-First-Out) principle.
 * Uses an array to store elements and supports push, pop, peek, and listing all elements.
 *
 * @param <T> the type of elements stored in the stack
 */
public class Stack <T>{
    private T[] items;
    private int top;
    private int size;
    /**
     * Default constructor initializes stack with capacity 10.
     */
    public Stack(){
        this.size = 10;
        this.items = (T[])new Object[size];
        this.top = 0;
    }
    /**
     * Constructor initializes stack with specified capacity.
     *
     * @param size the maximum number of elements the stack can hold
     */
    public Stack(int size){
        this.size = size;
        this.items = (T[])new Object[size];
        this.top = 0;

    }
    /**
     * Pushes an element onto the stack.
     *
     * @param item the element to push
     * @throws StackFullException if the stack is already full
     */
    public void push(T item) throws StackFullException{
        if(this.top == this.size){
            throw new StackFullException("Stack is full");
        }
        items[top] = item;
        top++;
    }
    /**
     * Pops the top element from the stack.
     *
     * @return the element removed from the top
     * @throws StackEmptyException if the stack is empty
     */
    public T pop() throws StackEmptyException{
        if(top == 0){
            throw new StackEmptyException("Stack is empty");
        }
        top--;
        return items[top];
    }
    /**
     * Peeks at the top element without removing it.
     *
     * @return the element at the top of the stack
     * @throws StackEmptyException if the stack is empty
     */
    public T peek() throws StackEmptyException{
        if(top == 0){
            throw new StackEmptyException("Stack is empty");
        }
        return items[top-1];
    }
    /**
     * Lists all elements in the stack from bottom to top, separated by semicolons.
     *
     * @return a string representation of the stack elements
     */
    public String list(){
        String list = "";
        for(int i = 0; i < top; i++){
            if (i > 0) {
                list += ";";
            }
            list += items[i];
        }
        return list;
    }
}
