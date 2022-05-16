package javaLab;

import java.sql.Array;

public class Test18 extends Task18 {
    public static void main(String[] args) {
        String[] lines = new String[9];
        lines[0] = "(a)(b) c (d(efg))";
        lines[1] = "(a(b)c)d)";
        lines[2] = "()()()";
        lines[3] = "()(())";
        lines[4] = ")(";
        lines[5] = "((())";
        lines[6] = "(()))";
        lines[7] = "( () )) (( () )";
        lines[8] = " ";

        for (int i = 0; i < lines.length; i++) {
            System.out.print("Случай " + i + ": ");
            System.out.println(lines[i]);
            if (checkBracket(lines[i])) {
                System.out.println("OK");
            } else {
                System.out.println("Error");
            }
        }

    }
}
