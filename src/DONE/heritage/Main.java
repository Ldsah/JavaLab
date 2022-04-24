package DONE.heritage;

public class Main {
    public static void main(String[] args) {
        BaseWeight baseWeight = new BaseWeight();
        System.out.println(baseWeight.getWeight());

        BaseLength baseLength = new BaseLength();
        System.out.println(baseLength.getLength());

        BaseWeightLength baseWeightLength  = new BaseWeightLength();
        System.out.println(baseWeightLength.getWeight());
        System.out.println(baseLength.getLength());





    }



}
