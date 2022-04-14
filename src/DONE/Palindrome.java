package DONE;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.print("Введите пятизначное число: ");

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int isPalindrome = Integer.parseInt(s);

        if(s.length() != 5){
            System.out.println("Введите пятизначное число!");
        }


        if((isPalindrome/10000 == isPalindrome%10) && ((isPalindrome/1000)%10 == (isPalindrome%100)/10)){
            System.out.println("Это число палиндром.");
        }else {
            System.out.println("Это число не палиндром");
        }





    }


}


