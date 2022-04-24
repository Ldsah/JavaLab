package DONE;

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
        int height = scanner.nextInt();

        System.out.println("Введите длину кирпича: ");
        int bricksLength = scanner.nextInt();

        System.out.println("Введите высоту кирпича: ");
        int bricksHeight = scanner.nextInt();

        System.out.println("Введите ширину кирпича: ");
        int bricksWidth = scanner.nextInt();

        if ((height >= bricksHeight) &&
                (length >= bricksWidth || length >= bricksLength)) {
            System.out.println("Кирпич подходит");
        } else if ((height >= bricksLength) &&
                (length >= bricksHeight || length >= bricksWidth)) {
            System.out.println("Кирпич подходит");
        } else if ((height >= bricksWidth) &&
                (length >= bricksHeight || length >= bricksLength)) {
            System.out.println("Кирпич подходит");
        } else {
            System.out.println("Кирпич не подходит");
        }


    }


}



