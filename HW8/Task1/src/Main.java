import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //#1 Создать массив из 10 целых чисел. Значения могут быть любыми
        int[] array = {5, 19, 32, 11, 56, 49, 77, 90, 26, 85};

        //#2 Распечатать все значения массива начиная с 0 до последнего индексов.
        for (int j : array) {
            System.out.print(j + " ");
        }

        System.out.println("\n");
        //#3 Распечатать все значения массива с конца (начиная с последнего до 0 индексов).
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\n");
        //#4 *** Задание особой сложности. Развернуть массив(см конец урока).
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - (1 + i)];
            array[array.length - (1 + i)] = temp;
        }

        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
