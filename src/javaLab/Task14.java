package javaLab;

//"След матрицы
//        Найти след матрицы,  след матрицы — сумма элементов главной диагонали. Размер матрицы вводит пользователь,
//        матрицу заполнять случайными числами.
//        ----------------
//        Пример работы программы:
//        Введите количество строк матрицы: 5
//
//        61  16  39  79  99
//        66  42  71   5  68
//        80  64  34  12  44
//        63  64  40  21   3
//        17  31  99  41  72
//
//        След матрицы: 230
//        Замечание: если в итоге для подсчета вы используете два вложенных цикла, проходящих по всем элементам двумерного
//        массива, то вам нужно изменить алгоритм так, чтобы там был только один цикл. "


import org.w3c.dom.CDATASection;

import java.util.Random;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {

        System.out.println("Введите количество строк матрицы: ");
        Scanner scanner = new Scanner(System.in);
        int matrixSize = scanner.nextInt();

        //заполняем матрицу случайными числами
        int[][] matrix = new int[matrixSize][matrixSize];
        for (int x = 0; x < matrixSize; x++) {
            for (int y = 0; y < matrixSize; y++) {
                matrix[x][y] = new Random().nextInt(100);
            }
        }

        //вывод матрицы на экран
        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[x].length; y++) {
                System.out.print(" " + matrix[x][y]);
            }
            System.out.print("\n");

        }

        long result = 0; //след матрицы
        int residue = matrixSize - 1;  //переменная для сохранения второго индекса матрицы, для движения по диагонали

        for (int i = 0; i < matrixSize; i++) {
            result += matrix[i][residue]; //i - первый индекс матрицы
            --residue; //уменьшение второго индекса матрицы
        }

        System.out.println(result);
    }
}
