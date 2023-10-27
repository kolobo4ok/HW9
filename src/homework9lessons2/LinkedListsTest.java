package homework9lessons2;

public class LinkedListsTest {
    public static void main(String[] args) {
        MyLinkedList myList = new MyLinkedList();
        myList.add("A");
        myList.add("R");
        myList.add("T");
        myList.add("U");
        myList.add("R");
        System.out.println("Size: " + myList.size());

        System.out.println("Element at index 2: " + myList.get(2));

        myList.remove(1);
        System.out.println("Size after removing element at index 1: " + myList.size());

        myList.clear();
        System.out.println("Size after clearing: " + myList.size());
    }
}