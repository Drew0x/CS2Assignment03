
import java.util.Scanner;

public class StringReverser {
    public static void main(String[] args) {
        System.out.println("Enter a string to reverse:");
        String input = getString("   It should be a non-empty string.");
        String Reversed = "";
        //1
        LinkedStack<Character> stack = new LinkedStack<>();
        //2
        for(int i = 0; i < input.length(); i++) {
        	stack.push(input.charAt(i));
        }
        //3
        while(!stack.isEmpty()) {
        	Reversed += stack.pop();
        }
        //4
        System.out.println("Original String : " + input + "\n" + "Reversed String: " + Reversed + "\n");
        // ADD CODE TO COMPLETE THE MAIN X
        // 1. Create a LinkedStack<Character> X
        // 2. Push each character of the input string onto the stack X
        // 3. Pop each character off the stack to build the reversed string X
        // 4. Print the original and reversed strings X
    }

    private static String getString(String prompt) {
        Scanner input;
        String result = "default"; // Default value
        try {
            input = new Scanner(System.in);
            System.out.println(prompt);
            result = input.nextLine();
            if (result.isEmpty()) {
                System.out.println("Empty input received. Will use 'default' as the default value.");
                result = "default";
            }
        } catch (Exception e) {
            System.out.println("There was an error with System.in");
            System.out.println(e.getMessage());
            System.out.println("Will use 'default' as the default value");
        }
        return result;
    }
}