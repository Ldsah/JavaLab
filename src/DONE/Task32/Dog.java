package DONE.Task32;

import java.util.Random;

public class Dog extends Thread{
    int health;
    String name;
    Dog enemy;

    public Dog (int health, String name){
        this.health = health;
        this.name = name;
    }
    public void setEnemy(Dog enemy){
        this.enemy = enemy;
    }
    public void run(){
        Random r = new Random();
        while(health >0 && enemy.health > 0){
            enemy.health = enemy.health - r.nextInt(5);
            System.out.println(name+ " hit enemy. Life left: " + enemy.health );
            try{
                Thread.sleep(50);
            } catch (InterruptedException e) {
            }
        }
    }
}
