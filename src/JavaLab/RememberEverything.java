package JavaLab;

import java.io.IOException;
import java.util.Scanner;

public class RememberEverything {
    public static void main(String[] args) throws IOException {
        System.out.print( "Введите число: ");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        switch(i){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Oops... There are only seven days in a week!");
        }
//        int k = System.in.read();
//        System.out.println(k);
    }
}
