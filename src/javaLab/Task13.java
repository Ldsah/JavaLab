package javaLab;

//"Анализ Креативности Текста.
//        Подсчитать количество слов и букв в строке. Слово - это последовательность символов, разделенных одним или
//        несколькими символами-разделителями. Буква - это символ, не являющийся разеделителем.
//        Разделители слов: пробел, табуляция, перевод каретки, знаки препинания. Полный список: "",.!?:;()""
//        Нельзя использовать для разбора строки класс StringTokenizer, String.split(), substring() и подобные им.
//        В программе нельзя использовать вложенные циклы. Так же не рекомендуется использовать метод String.indexOf().
//        Программа не должна создавать дополнительные строки сравнимого размера с введенной строкой.
//        Программа должна проходить тест на следующих данных:
//        1) ""    xxx,    xx x   x""
//        2) ""xxxxxxx""
//        3) ""xxxxxxx.    ""
//        4) ""xxx,xxxx""
//        5) ""xxx,xxxx""
//        6) ""........""
//        7) ""... xxx...  ""
//        8) """" - пустая строка

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int countLetters = 0;
        int countWords = 0;
        boolean expectedChar = false;
        boolean expectedSymbol = true;
        for (int i = 0; i < line.length(); i++) {
            if (line.equals(" ")) {
                System.out.println("Пустая строка");
            } else if ((line.charAt(i) >= 1040 && line.charAt(i) <= 1103) || (line.charAt(i) >= 65
                    && line.charAt(i) <= 122)) {
                countLetters++;
                expectedChar = true;
            } else if (((line.charAt(i) == ',') || (line.charAt(i) == '.') || (line.charAt(i) == '!') ||
                    (line.charAt(i) == '?') || (line.charAt(i) == ':') || (line.charAt(i) == ';') ||
                    (line.charAt(i) == '(') || (line.charAt(i) == ')') || (line.charAt(i) == ' ')
            )) {
                expectedChar = false;
                expectedSymbol = true;
            }
            if(expectedChar&&expectedSymbol){
                countWords++;
                expectedSymbol = false;
            }
        }
        System.out.println("Количество букв: " + countLetters);
        System.out.println("Количество слов: " + countWords);




    }


}
