package javaLab.polymorphism;

public class Main {

    public static void main(String[] args) {
        Mammal[] mammals = new Mammal[5];

        mammals[0] = new Mammal();
        mammals[1]  = new Rodent();
        mammals[2]   = new Cricetidae();
        mammals[3]    = new Muskrat();
        mammals[4] = new Humster();

        for (int i = 0; i < 4; i++) {
            mammals[i].eat();
        }
    }
}
