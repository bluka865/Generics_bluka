package bluka;
/**
 * Test class for the generic Stack class.
 * **/
public class TestClass {
    public static void main(String[] args) {
        Stack<Integer> numberStack = new Stack<>(5);
        System.out.println("Number Stack Test:");
        try {
            numberStack.push(10);
            numberStack.push(20);
            numberStack.push(30);

            System.out.println("Peek: " + numberStack.peek());
            System.out.println("List: " + numberStack.list());

            System.out.println("Pop: " + numberStack.pop());
            System.out.println("List after pop: " + numberStack.list());

        } catch (StackFullException | StackEmptyException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n--- Text Stack ---");
        Stack<String> textStack = new Stack<>(5);
        try {
            textStack.push("Hello");
            textStack.push("World");
            textStack.push("Java");
            System.out.println("Peek: " + textStack.peek());
            System.out.println("List: " + textStack.list());
            System.out.println("Pop: " + textStack.pop());
            System.out.println("List after pop: " + textStack.list());
        } catch (StackFullException | StackEmptyException e) {
            System.out.println(e.getMessage());
        }
        try {
            Stack<Double> emptyStack = new Stack<>(2);
            emptyStack.pop(); // sollte StackEmptyException werfen
        } catch (StackEmptyException e) {
            System.out.println("Caught expected exception: " + e.getMessage());
        } catch (StackFullException e) {
            System.out.println(e.getMessage());
        }
    }
}