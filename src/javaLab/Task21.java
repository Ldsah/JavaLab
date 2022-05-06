package javaLab;
//"Длинный и короткий
//        Поиск в массиве целых чисел минимума и максимума значений.
//        Нельзя использовать метод Arrays.sort и подобные ему. Нельзя сортировать массив значений."	1


import java.util.Random;

public class Task21 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(400);
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n" + "Максимальное значение: " + maxValue(arr));
        System.out.println("Минимальное значение: " + minValue(arr));

    }

    public static int maxValue(int[] arr){
        int maxValue = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    public static int minValue(int[] arr){
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < minValue){
                minValue = arr[i];
            }
        }
        return minValue;
    }



}
