package javaLab;


import java.sql.SQLOutput;
import java.util.Scanner;
//"Вычисление Функции Высшего Порядка.
//        Посчитать факториал числа, вводимого с клавиатуры пользователем.
//        Пользователь может ввести отрицательное число или буквенные символы.
//        Алгоритм не должен использовать рекурсию."
public class Task17 {
    private static Exception IllegalArgumentException;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        try{
        int number = Integer.parseInt(in.nextLine());
        int factorial = number;
        if(factorial <0){
            throw IllegalArgumentException;
        }
        for (int i = 1; i < number; i++) {
            factorial = factorial*i;
        }
        System.out.println(factorial);} catch (NumberFormatException e ){
            System.out.println("Введены неверные данные");
        } catch (Exception e) {
            System.out.println("Введены неверные данные");
        }

    }

}
