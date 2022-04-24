package Task32;

import java.util.Random;

public class Person extends Thread {
    int health;
    String name;

    Person enemy;

    public Person(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void setEnemy(Person name) {
        this.enemy = name;
    }

    @Override
    public void run() {
        while (health > 0 && enemy.health > 0) {
            int damage = new Random().nextInt(10);
            enemy.health = enemy.health - damage;
            System.out.println(name + " нанес " + damage + " урона");
            if (enemy.health <= 0) {
                System.out.println(enemy.name + " повержен!");
            } else {
                System.out.println("У " + enemy.name + " осталось: " + enemy.health);
            }
        }
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
        }

    }
}
