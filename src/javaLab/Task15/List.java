package javaLab.Task15;


//        2) в классе List реализовать метод addElement() - добавление элемента в начало списка.
//        3) в классе List реализовать метод getSize () - возвращает размер списка. Нужно сделать так,
//        чтобы при вызове этого метода он возвращал одно закешированное значение. Не нужно чтобы метод проходил
//        по всему списку.
//        4) в классе List реализовать метод remove() - удаление первого элемента списка и возвращение этого значения в
//        качестве результата работы метода.
public class List {
    private int size = 0;

    Element first = null;

    public int getSize(){
        System.out.print("Количество элементов в списке: ");
        return size;
    }

    public void addElement(int newElement){
       Element new_Element = new Element(newElement);
       new_Element.nextElement = first;
       first = new_Element;
       System.out.println("Первый элемент сейчас: " + first.currentElement);
       size++;
    }

    public int remove(){
        Element newFirst = first;
        first = newFirst.nextElement;
        size--;
        System.out.print("Удален элемент: ");
        return newFirst.currentElement;
    }


}
