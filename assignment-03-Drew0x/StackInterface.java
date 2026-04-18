
public interface StackInterface<T> {
    /** Adds a new entry to the top of this stack.
        @param item  The object to be added to the stack. */
    public void push(T item);
		// TODO Auto-generated method stub
    
    /** Removes and returns the top entry from this stack.
        @return  The object at the top of the stack.
        @throws  java.util.EmptyStackException if the stack is empty. */
    public T pop();
    
    /** Retrieves the top entry from this stack without removing it.
        @return  The object at the top of the stack.
        @throws  java.util.EmptyStackException if the stack is empty. */
    public T peek();

    /** Retrieves the second entry from the top of this stack without removing it.
        @return  The second object from the top of the stack.
        @throws  IllegalStateException if the stack has fewer than two items. */
    public T peekSecond();
    
    /** Sees whether this stack is empty.
        @return  True if the stack is empty, or false if not. */
    public boolean isEmpty();
}
