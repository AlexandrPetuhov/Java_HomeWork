package Lesson_1;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        // 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        // 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        // 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

        int i = new Random().nextInt(0, 2000);               // Присвоение переменной i рандомного числа
        System.out.println("Выпавшее число: " + i);                       // Вывод выпавшего числа в консоль
        int n = Integer.toBinaryString(i).length() - 1;                   // Вычисление старшего значащего бита выпавшего числа
        System.out.println("Старший значащий бит выпавшего числа: " + n); // Вывод номера этого бита в консоль
        int size = 0;                                                     // Создание переменной, которая станет размером массива
        for (int j = i; j <= Short.MAX_VALUE; j++) {                      // Перебор всех чисел в промежутке от i до Short.MAX_VALUE с помощью цикла for
            if (j % n == 0) {                                             // Условие, при котором проверяется кратность числа j на число n
                size++;                                                   // Увеличение размера будущего массива на 1 (повторяется пока действует условие, и работает цикл for)
            }
        }
        int m1[] = new int[size];                                         // Создание массива m1. Размер size был определен спомощью цикла for.
        int index = 0;                                                    // Создание переменной, которая будет служить в качестве индекса массива
        for (int j = i; j <= Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                m1[index] = j;                                            // Запись чисел в массив, соответствующих условию if
                index++;                                                  // Увеличение индекса для дальнейшего заплнения массива
            }
        }
        int size1 = 0;
        for (int j = Short.MIN_VALUE; j < i; j++) {                       // Перебор всех чисел в промежутке от Short.MIN_VALUE до i с помощью цикла for
            if (j % n != 0) {                                             // Условие, при котором проверяется некратность числа j на число n
                size1++;
            }
        }
        int m2[] = new int[size1];
        int index1 = 0;
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j % n != 0) {
                m2[index1] = j;
                index1++;
            }
        }
        System.out.println(Arrays.toString(m1));                          // Вывод получившегося массива в консоль
        System.out.println(Arrays.toString(m2));
    }
}        