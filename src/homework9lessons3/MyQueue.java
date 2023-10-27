/*Написати свій клас MyQueue як аналог класу Queue, який буде працювати за принципом FIFO (first-in-first-out).

Можна робити за допомогою Node або використати масив.

Методи

    add(Object value) додає елемент в кінець
    clear() очищає колекцію
    size() повертає розмір колекції
    peek() повертає перший елемент з черги
    poll() повертає перший елемент з черги і видаляє його з колекції
*/
package homework9lessons3;

public class MyQueue {
    private Node front; // Початок черги
    private Node rear;  // Кінець черги
    private int size;   // Розмір черги

    public void add(Object value) {     //  add(Object value) додає елемент в кінець
        Node newNode = new Node(value);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public void clear() {       //  clear() очищає колекцію
        front = null;
        rear = null;
        size = 0;
    }

    public int size() {     //  size() повертає розмір колекції
        return size;
    }

    public Object peek() {  //peek() повертає перший елемент з черги
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return front.data;
    }

    public Object poll() {  //poll() повертає перший елемент з черги і видаляє його з колекції
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        Object data = front.data;
        front = front.next;
        size--;
        return data;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    private static class Node {    //inner class
        Object data;
        Node next;

        Node(Object data) {
            this.data = data;
        }
    }
}