/*
Написати свій клас MyStack як аналог класу Stack, який працює за принципом LIFO (last-in-first-out).

Можна робити за допомогою Node або використати масив.

Методи

    push(Object value) додає елемент в кінець
    remove(int index) видаляє елемент за індексом
    clear() очищає колекцію
    size() повертає розмір колекції
    peek() повертає перший елемент стеку
    pop() повертає перший елемент стеку та видаляє його з колекції
 */
package stack;

public class MyStack {
    private Node top; // Вершина стеку
    private int size; // Розмір стеку

    private class Node {
        Object data;
        Node next;

        Node(Object data) {
            this.data = data;
        }
    }

    public void push(Object value) {        //  push(Object value) додає елемент в кінець
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public void remove(int index) {     //  remove(int index) видаляє елемент за індексом
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        if (index == 0) {
            top = top.next;
        } else {
            Node current = top;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

    public void clear() {       //  clear() очищає колекцію
        top = null;
        size = 0;
    }

    public int size() {     //  size() повертає розмір колекції
        return size;
    }

    public Object peek() {      //  peek() повертає перший елемент стеку
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return top.data;
    }

    public Object pop() {       //  pop() повертає перший елемент стеку та видаляє його з колекції
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        Object data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}