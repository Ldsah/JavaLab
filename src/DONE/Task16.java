package DONE;

//"Средний по больнице
//        Разработать функцию, в которую передается в качестве аргументов массив типа float.
//        Функция должна возвращать среднее арифметическое элементов массива.
//        Если размер массива - нуль, то среднее арифметическое должно быть также нуль."


public class Task16 {
    float [] array = new float[5];

    public static void main(String[] args) {
        float [] array = new float[5];
        for (int i = 0; i < array.length; i++) {
            array[i] =(float) Math.random();
            System.out.println(array[i]);

        }
        System.out.println(averageValue(array));
    }

    public static float averageValue(float[] array){
        float result;
        if(array.length == 0){
            result = 0;
        }else{
            float sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            result = sum/array.length;
        }
        return result;
    }
    
}
