package DONE.Task32;

public class Arena {
    public static void main(String[] args) {
        Person batman = new Person("Batman", 5000);
        Person joker = new Person("Joker", 5000);
        batman.setEnemy(joker);
        joker.setEnemy(batman);

        joker.start();
        batman.start();



    }
}
