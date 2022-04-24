package DONE;

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
        System.out.println("Line1");
        try {
            throw new Exception("Try 1");
            //System.out.println("Line 2"); не компилируется
        } catch (Exception e) {
            System.out.println("Line 3: inside catch clause");
        } finally {
            System.out.println("Line4: inside finally");
        }
        System.out.println("Line 5");
    }

}
