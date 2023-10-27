package homework9lessons3;

public class MyQueueTest {
    public static void main(String[] args) {


        MyQueue myQueue = new MyQueue();
        myQueue.add("A");
        myQueue.add("R");
        myQueue.add("T");
        myQueue.add("U");
        myQueue.add("R");

        System.out.println("Size: " + myQueue.size());

        System.out.println("Peek: " + myQueue.peek());

        System.out.println("Poll: " + myQueue.poll());
        System.out.println("Size after poll: " + myQueue.size());

        myQueue.clear();
        System.out.println("Size after clearing: " + myQueue.size());
    }
}
