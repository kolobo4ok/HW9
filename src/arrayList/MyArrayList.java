//Напишіть свій клас  MyArrayList як аналог класу ArrayList. Можна використовувати 1 масив для зберігання даних.
// HomeWork module 9 lessons 1. by Abramian
package arrayList;

public class MyArrayList {
    private Object[] array;
    private int size;

    public MyArrayList() {                  // defould значення.
        this.array = new Object[2];
        this.size = 0;
    }

    public MyArrayList(int size) {
        this.array = new Object[size];
        this.size = 0;
    }

    public Object get(int index) {
        if (index > array.length || index < 0) {
            throw new ArrayIndexOutOfBoundsException("You trying to get an index " + index + ".\nThis index don't have, " +
                    "please enter index range from 0 to " + array.length + ".\n");
        }
        return array[index];
    }

    public void add(Object value) {                                         //this method accepts elements and add her
        if (size == array.length) {
            Object[] arrays1 = new Object[array.length + 1];
            System.arraycopy(array, 0, arrays1, 0, size);
            array = arrays1;
        }
        array[size] = value;
        size++;
    }

    public void remove(int index) {                                            //this method delete elements po index
        if (index > array.length || index < 0) {
            throw new ArrayIndexOutOfBoundsException("You delete an index " + index + ".\nThis index don't have, please " +
                    "enter index range from 0 to " + array.length + ".\n");
        } else {
            System.arraycopy(array, 0, array, index, size - 1);
            array[index] = null;
        }
    }

    public void clear() {                                                       //this method clear all info
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
            size = 0;
        }
    }

    public void printArrays() {                                                 //this method write all info
        for (int i = 0; i < array.length; i++) {
            System.out.print(get(i) + " ");
        }
        System.out.println();
    }

    public int size() {                                                     //this method return size collecshon
        for (int i = 0; i < size; i++) {
            if (array[i] == null) {
                size--;
            }
        }
        return size;
    }
}