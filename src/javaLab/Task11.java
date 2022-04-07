package javaLab;

import java.util.Scanner;

//"Незадачливый строитель.
//        Напишите программу, которая должна определить, пройдет ли кирпич в отверстие.
//        Размеры отверстия (длина и высота) вводит пользователь.
//        Тоже самое касается габаритов кирпича, пользователь вводит в программу значения длины, ширины и высоты кирпича.
//        Умный строитель умеет вращать кирпич и может пытаться пропихнуть кирпич в отверстие разными сторонами."

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину отверстия: ");
        int length = scanner.nextInt();

        System.out.println("Введите высоту отверстия: ");
        int high = scanner.nextInt();

        System.out.println("Введите длину кирпича: ");
        int bricksLength = scanner.nextInt();

        System.out.println("Введите высоту кирпича: ");
        int bricksHigh = scanner.nextInt();

        System.out.println("Введите ширину кирпича: ");
        int bricksWidth = scanner.nextInt();

        if ((high == bricksHigh && length == bricksLength) || (high == bricksLength && length == bricksHigh)) {
            System.out.println("Кирпич подходит!");
        } else if (bricksWidth == high && (length == bricksLength || length == bricksHigh)) {
            System.out.println("Кирпич подходит! ");
        } else if ((bricksWidth == length) && (high == bricksLength || high == bricksHigh)) {
            System.out.println("Кирпич подходит");
        }

//        if(high != bricksLength || high !=bricksHigh || high )


    }
}



