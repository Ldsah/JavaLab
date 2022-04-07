package javaLab;

//       "Хорошая попытка
//        Отработка try-catch-finally-throw
//        реализовать пример:
//        try {
//        sout (1) - должен вывести на экран
//        throw new Exception ()
//        sout (2) - Не должен скомпилироваться.
//        } catch (Exception e)
//        sout (3) - должен вывести на экран при брошенном исключении
//        finally {
//        sout (4) - должен вывести на экран
//        }"

import java.io.FileNotFoundException;
import java.io.FileReader;

public class NiceTry {
    public static void main(String[] args) {
        try{
            System.out.println("Должен вывести на экран");
            FileReader fd = new FileReader("тэги");
            System.out.println("Не должен скомпилироваться");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
