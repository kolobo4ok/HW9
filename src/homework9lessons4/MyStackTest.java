package homework9lessons4;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push("A");
        myStack.push("R");
        myStack.push("T");
        myStack.push("U");
        myStack.push("R");

        System.out.println("Size: " + myStack.size());

        System.out.println("Peek: " + myStack.peek());

        System.out.println("Pop: " + myStack.pop());
        System.out.println("Size after pop: " + myStack.size());

        myStack.clear();
        System.out.println("Size after clearing: " + myStack.size());
    }
}