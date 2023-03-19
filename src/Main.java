/*
Создайте переменную для массива из 10 элементов.
Заполните его произвольными значениями целочисленного типа.
Выведите на экран элементы, стоящие на четных позициях.
 */

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int ARRAY_LEN = 10; // Размер исходного массива
        int[] arrayInit = new int[ARRAY_LEN]; // Исходный массив
        int[] arrayEvenInd = new int[ARRAY_LEN / 2]; // Массив для вывода элементов исходного массива с четными
        // индексами, его размер в два раза меньше исходного
        Random rand = new Random();
        for (int i = 0; i < arrayInit.length; i++) {
            arrayInit[i] = rand.nextInt(50); // Заполняем массив случайными числами не более 50
        }
        System.out.println("Исходный массив\n" + Arrays.toString(arrayInit));

        for (int i = 0; i < arrayInit.length; i++) {
            if (i % 2 == 0) {                        // Если элемент исходного массива имеет четный индекс,
                arrayEvenInd[i / 2] = arrayInit[i];   // добавляем этот элемент в дополнительный массив
            }
        }
        System.out.println("Массив с элементами исходного массива, имеющими четный индекс\n" +
                Arrays.toString(arrayEvenInd));
    }
}