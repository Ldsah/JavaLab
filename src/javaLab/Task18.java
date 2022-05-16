package javaLab;
//"Математический Аппарат Вычисления Произвольной Функции
//        Установить правильность расстановки скобок в математическом выражении. Программа должна на введенную строку
//        выдавать ответ “правильно/неправильно”. Входная строка может выглядеть вот так: “(a)(b) c (d(efg))”,
//        “(a(b)c)d)”.
//        Программа должна проходить тест на следующих данных:
//        1) ""()()()"" OK
//        2) ""()(())"" OK
//        3) "")("" Error
//        4) ""(()())"" OK
//        5) """" OK
//6) ""((())"" Error
//7) ""(()))"" Error
//9) ( () )) (( () )  - Error
//Модифицировать введенный текст нельзя.
//Создавать структуры сходного размера нельзя."

import java.util.ArrayDeque;
import java.util.Deque;


public class Task18 {


    public static boolean checkBracket(String line) {
        Deque<Character> stack = new ArrayDeque<>();


        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '(') {
                stack.push(line.charAt(i));
            } else if (line.charAt(i) == ')') {
                if (stack.peekFirst() != null) {
                    stack.pollFirst();
                } else {
                    return false;
                }

            }
        }

        if (stack.pollFirst() != null) {
            return false;
        } else {
            return true;
        }

//        while(scanner.hasNext()) {
//            String symbol = scanner.next();
//            System.out.println(symbol);
//        }
//        scanner.close();
//        System.out.println("Всё");

    }


}

