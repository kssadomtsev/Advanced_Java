package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task4 {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>(); // внутри не гарантируется порядок добавления
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(); // гарантируется порядок добавления
        Map<Integer, String> treeMap = new TreeMap<>(); // гарантирует, что пару ключ, значение будут отсортированы по ключу (natural ordering)

        testMap(hashMap);
        testMap(linkedHashMap);
        testMap(treeMap);
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(39, "A");
        map.put(2, "B");
        map.put(1500, "C");
        map.put(19, "D");
        map.put(16, "E");
        map.put(1, "F");
        map.put(67, "G");
        map.put(202, "I");
        System.out.println(map.getClass().getSimpleName());
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    class Animal<?> {

    }


}
