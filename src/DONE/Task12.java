package DONE;
//"Код Да Винчи
//        Вывести на экран N чисел Фибоначчи.
//        Числа Фибоначчи - это ряд таких чисел, который начинается с 1 и 1 и затем каждое следующее число
//        равно сумме двух предыдущих.
//        Начало последовательности выглядит так: 1, 1, 2, 3, 5, 8, 13, 21, 34,
//        Число N вводится пользователем с клавиатуры.
//        Программа должна достаточно быстро работать для подсчета 500 чисел Фибоначчи.
//        Алгоритм не должен использовать рекурсию."

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        long first = 1;
        long second = 1;

        System.out.print("Введите число N: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(first + ", " + second);
        long next;
        for (int i = 0; i < n; i++) {
            next = first + second;
            first = second;
            second = next;
            System.out.print(", " + next);
        }

    }


}
