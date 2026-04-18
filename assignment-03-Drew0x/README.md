[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/wjuv8poN)
# Assignment-03-Stack Implementation in Java

Implement a stack data structure using a linked structure in Java. A stack is a Last-In-First-Out (LIFO) data structure that supports basic operations like push, pop, peek, and checking if it’s empty. You will complete a provided skeleton code by implementing the required methods and then use the stack in a simple application to reverse a string.

**Requirements**

**Stack Interface (StackInterface.java): This interface is provided, do not modify**

Defines the contract for stack operations:

**void push(T item):** Adds an item to the top of the stack.

**T pop():** Removes and returns the top item; throws an exception if empty.

**T peek():** Returns the top item without removing it; throws an exception if empty.

**T peekSecond():** Returns the second item from the top without removing it; throws an exception if the stack has fewer than two items.

**boolean isEmpty():** Returns true if the stack is empty, false otherwise.

**Linked Stack Implementation (LinkedStack.java): You need to complete the implementation of this class**

Implement a generic stack using a singly linked list.
Use a Node inner class to represent each element in the stack.
Complete the following methods:

push(T item): Add a new node to the top (head) of the list.

pop(): Remove and return the top node’s data; throw EmptyStackException if empty.

peek(): Return the top node’s data without removing it; throw EmptyStackException if empty.

peekSecond(): Returns the second node data without removing it; throws an exception if the stack has fewer than two items.

isEmpty(): Check if the stack has no elements.

Maintain a reference to the top node (topNode) and track the number of entries (numberOfEntries).

**String Reverser Application (StringReverser.java): You need to complete the implementation of this class**

Use the LinkedStack to reverse a user-input string.

Steps:

Prompt the user to enter a string (use the provided getString() method).

Push each character of the string onto the stack.

Pop each character off the stack and build the reversed string.

Print the original and reversed strings.

Complete the main method to achieve this.

**Deliverables**

Submit completed LinkedStack.java and StringReverser.java files.

Ensure the code compiles and runs without errors.

Test your implementation with various inputs (e.g., "hello", "12345", "a").
