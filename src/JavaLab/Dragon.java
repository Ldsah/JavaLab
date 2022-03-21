package JavaLab;

public class Dragon {
    String name;
    Integer tooth;

    public String getName(){
        return name;
    }

    public Integer getTooth(){
        return tooth;
    }

    public void fire(Dragon dragon){
        System.out.println("Ваш дракон ударил" + dragon.getName());
    }


}
