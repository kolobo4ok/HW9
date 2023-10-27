package hashMap;

public class Main {
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();
        map.put("A", 1);
        map.put("R", 2);
        map.put("T", 3);
        map.put("U", 4);
        map.put("R", 5);

        System.out.println("Size: " + map.size());

        System.out.println("Get 'T': " + map.get("T"));

        map.remove("T");
        System.out.println("Size after removing 'T': " + map.size());

        map.clear();
        System.out.println("Size after clearing: " + map.size());
    }
}