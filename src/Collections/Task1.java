package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        measureTime(arrayList);
        measureTime(linkedList);

    }
// Writing values in the end of list
//    private static void measureTime(List<Integer> list) {
//        long startTime = System.currentTimeMillis();
//        for (int i = 0; i < 1_000_000; i++) {
//            list.add(i);
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println(endTime - startTime);
//    }

// Getting values
//    private static void measureTime(List<Integer> list) {
//        for (int i = 0; i < 1_00_000; i++) {
//            list.add(i);
//        }
//        long startTime = System.currentTimeMillis();
//        for (int i = 0; i < 1_00_000; i++) {
//            list.get(i);
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println(endTime - startTime);
//    }

    // Writing values always at 0 pos
    private static void measureTime(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }

}
