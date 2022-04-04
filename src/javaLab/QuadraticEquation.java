package javaLab;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        System.out.println("Введите коэффициенты уравнения через пробел: ");
        Scanner s = new Scanner(System.in);
        double a = s.nextInt();
        double b = s.nextInt();
        double c = s.nextInt();
        double discriminant = b*b - 4*a*c;
        if(discriminant < 0){
            System.out.println("Корней нет.");
        }else if(discriminant ==0){
            double x = (-b)/(2*a);
            System.out.println("У данного уравнения один корень: " + x);
        }else{
            double x1 = ((-b) + Math.sqrt(discriminant))/(2*a);
            System.out.println("Первый корень уравнения: " + x1);
            double x2 = ((-b) - Math.sqrt(discriminant))/(2*a);
            System.out.println("Второй корень уравнения: " + x2);
        }
    }
}
