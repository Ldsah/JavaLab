package Arena;

public class Arena {
    public static void main(String[] args) {
        Dog rik = new Dog(500, "Rik");
        Dog mik = new Dog(600, "Mik");
        rik.setEnemy(mik);
        rik.setPriority(Thread.MAX_PRIORITY);
        mik.setPriority(Thread.MIN_PRIORITY);
        mik.setEnemy(rik);

        mik.start();
        rik.start();
    }
}
