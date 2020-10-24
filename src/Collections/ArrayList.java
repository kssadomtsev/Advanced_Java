package Collections;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<Integer> arrayList = new java.util.ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList);
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(9));
        System.out.println(arrayList.size());

        // Output type 1
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        // Remove
        arrayList.remove(5);

        // Output type 2
        for (Integer x : arrayList) {
            System.out.println(x);
        }

    }
}
