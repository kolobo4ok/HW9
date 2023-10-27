package homework9lessons1;

public class ArraysListTest {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(25);        //add element value 25 index 0
        myArrayList.add(40);        //add element value 40 index 1
        myArrayList.add(5);         //add element value 5 index 2
        myArrayList.printArrays();
        System.out.println("Size: " + myArrayList.size() + "\n"); //print how many have element is not empty

//        myArrayList.remove(-2);//remove value 5
        myArrayList.remove(2);
        myArrayList.printArrays();
        System.out.println("Size: " + myArrayList.size() + "\n"); //print how many have element is not empty

//        System.out.println("Value element: " + myArrayList.get(6) + "\n");
        System.out.println("Value element: " + myArrayList.get(2) + "\n");

        myArrayList.clear();
        myArrayList.printArrays();
        System.out.println("Size: " + myArrayList.size() + "\n"); //print how many have element is not empty
    }
}