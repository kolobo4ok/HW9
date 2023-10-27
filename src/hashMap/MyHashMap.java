/*Написати свій клас MyHashMap як аналог класу HashMap.

Потрібно робити за допомогою однозв'язної Node.

Не може зберігати дві ноди з однаковими ключами.

Методи

    put(Object key, Object value) додає пару ключ + значення
    remove(Object key) видаляє пару за ключем
    clear() очищає колекцію
    size() повертає розмір колекції
    get(Object key) повертає значення (Object value) за ключем
*/

package hashMap;

public class MyHashMap {
    private Node[] table;
    private int capacity = 16;
    private int size = 0;

    public MyHashMap() {
        table = new Node[capacity];
    }

    private class Node {
        Object key;
        Object value;
        Node next;

        Node(Object key, Object value) {
            this.key = key;
            this.value = value;
        }
    }

    private int hash(Object key) {
        return key.hashCode() % capacity;
    }

    public void put(Object key, Object value) {     //  put(Object key, Object value) додає пару ключ + значення
        int index = hash(key);
        Node newNode = new Node(key, value);

        if (table[index] == null) {
            table[index] = newNode;
        } else {
            Node current = table[index];
            while (current != null) {
                if (current.key.equals(key)) {
                    current.value = value;
                    return;
                }
                if (current.next == null) {
                    break;
                }
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void remove(Object key) {        //  remove(Object key) видаляє пару за ключем
        int index = hash(key);
        Node current = table[index];
        Node prev = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    table[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public void clear() {       //  clear() очищає колекцію
        table = new Node[capacity];
        size = 0;
    }

    public int size() {     //  size() повертає розмір колекції
        return size;
    }

    public Object get(Object key) {     //  get(Object key) повертає значення (Object value) за ключем
        int index = hash(key);
        Node current = table[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null; // Ключ не знайдено
    }
}