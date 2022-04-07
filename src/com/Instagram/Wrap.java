package com.Instagram;

public class Wrap {
    public static void main(String[] args) {
        int y = 7;
        System.out.println(y);
        y = 0x7F;
        System.out.println(y);

        int x = 7;
        System.out.println("MAIN 1: x = " + x);
        m1(x);
        x++; //объяснить почему 8, а не 9;
        System.out.println("MAIN 2: x = " + x);

    }

    private static void m1(int x) {
        x++;
        System.out.println("M1: x = " + x);
    }
}
