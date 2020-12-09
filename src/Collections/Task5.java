package Collections;

import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        //testSet(hashSet);
        //testSet(linkedHashSet);
        //testSet(treeSet);
        hashSet.add("Tom");
        hashSet.add("Alice");
        hashSet.add("Bob");
        hashSet.add("Charly");
        hashSet.add("Donald");
        hashSet.add("Mike");


        System.out.println(hashSet.contains("Tom"));
        System.out.println(hashSet.contains("Tim"));
        System.out.println(hashSet.isEmpty());
    }

    public static void testSet(Set<String> set) {
        set.add("A");
        set.add("B");
        set.add("E");
        set.add("I");
        set.add("D");
        set.add("C");
        set.add("F");
        set.add("G");
        System.out.println(set.getClass().getSimpleName());
        for (String str : set) {
            System.out.println(str);
        }
    }
}
