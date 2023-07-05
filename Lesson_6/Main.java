package Lesson_6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Main {
    // Разработать программу, имитирующую поведение коллекции HashSet. В программе
    // содать метод add добавляющий элемент,
    // метод toString возвращающий строку с элементами множества *и метод
    // позволяющий читать элементы по индексу.
    // *Реализовать все методы из семинара.
    // Формат данных Integer.

    private static HashMap<Integer, Object> mySet = new HashMap<>();
    private static final Object VALUE = new Object();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            add(new Random().nextInt(1000));
        }
        Print();
        System.out.println();
        System.out.println(readIndex(3));

    }

    public static void add(Integer number) {
        mySet.put(number, VALUE);
    }

    private static void Print() {
        Iterator<Integer> iterator = mySet.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }

    private static int readIndex(int index) {
        return (Integer) mySet.keySet().toArray()[index];
    }
}
