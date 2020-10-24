package Collections.MyLinkedList;

public class Task2 {
    public static void main(String[] args) {
        IntegerLinkedList integerLinkedList = new IntegerLinkedList();
        System.out.println(integerLinkedList);
        integerLinkedList.add(1);
        integerLinkedList.add(2);
        integerLinkedList.add(3);
        System.out.println(integerLinkedList);
        System.out.println(integerLinkedList.get(0));
        System.out.println(integerLinkedList.get(2));
        integerLinkedList.remove(2);
        System.out.println(integerLinkedList);
        integerLinkedList.remove(1);
        System.out.println(integerLinkedList);
        integerLinkedList.remove(0);
        System.out.println(integerLinkedList);
    }
}
