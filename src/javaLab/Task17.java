package javaLab;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = Integer.parseInt(in.nextLine());
        int factorial = number;
        for (int i = 1; i < number; i++) {
          factorial = factorial*i;
        }
        System.out.println(factorial);
    }

}
