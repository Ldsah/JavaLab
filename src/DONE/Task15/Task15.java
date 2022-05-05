package DONE.Task15;
//"Односвязный список
//        1) Реализовать класс Element && класс List для хранения данных типа int.
//        2) в классе List реализовать метод addElement() - добавление элемента в начало списка.
//        3) в классе List реализовать метод getSize () - возвращает размер списка. Нужно сделать так,
//        чтобы при вызове этого метода он возвращал одно закешированное значение. Не нужно чтобы метод проходил
//        по всему списку.
//        4) в классе List реализовать метод remove() - удаление первого элемента списка и возвращение этого значения в
//        качестве результата работы метода.
//        Проверить работу этого метода в совокупности с методом add()
//        Запрещено использовать массивы и другие коллекции объектов."
public class Task15 {
    public static void main(String[] args) {
        List list = new List();
        list.addElement(10);
        System.out.println(list.getSize());
        list.addElement(13);
        System.out.println(list.getSize());
        list.addElement(14);
        System.out.println(list.getSize());
        list.addElement(15);
        System.out.println(list.getSize());
        System.out.println(list.remove());
        System.out.println(list.getSize());
    }
}
