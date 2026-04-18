import java.util.EmptyStackException;

public class LinkedStack<T> implements StackInterface<T> {
    private Node topNode; // Reference to the top of the stack
    private int numberOfEntries; // Number of items in the stack

    public LinkedStack() {
        topNode = null;
        numberOfEntries = 0;
    }

    // Implement this method to add an item to the top of the stack
    public void push(T item) {
    	Node newNode = new Node(item, topNode);
    	topNode = newNode;
        // CODE TO BE COMPLETED
    }

    // Implement this method to remove and return the top item
    public T pop() {
    	T top = peek();
    	assert topNode != null;
    	topNode = topNode.getNextNode();
    	return top;
    	
        // CODE TO BE COMPLETED
    }

    // Implement this method to return the second item from the top without removing it
    public T peekSecond() {
    	if(isEmpty() || topNode.next == null) {
    		throw new EmptyStackException();
    	} else {
    		return topNode.next.data;
    	}
        // CODE TO BE COMPLETED
    }
    // Implement this method to return the top item without removing it
    public T peek() {
    	if (isEmpty()) {
    		throw new EmptyStackException();
    	} else {
    		return topNode.data;	
    	}
        // CODE TO BE COMPLETED
    }

    // Implement this method to check if the stack is empty
    public boolean isEmpty() {
    	return (topNode == null);
        // CODE TO BE COMPLETED
    }

    private class Node {
        private T data; // Entry in stack
        private Node next; // Link to next node

        private Node(T dataPortion) {
            this(dataPortion, null);
        }

        private Node(T dataPortion, Node nextNode) {
            data = dataPortion;
            next = nextNode;
        }

        private T getData() {
            return data;
        }

        private void setData(T newData) {
            data = newData;
        }

        private Node getNextNode() {
            return next;
        }

        private void setNextNode(Node nextNode) {
            next = nextNode;
        }
    } // end Node
} // end LinkedStack
