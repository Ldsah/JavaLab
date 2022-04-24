package DONE;

//       "Поиск геномных последовательностей.
//        Задать массив целых чисел длиной 10 элементов.
//        Заполнить его числами.
//        Затем реализовать сортировку этой последовательности от меньшего к большему.
//        Результат вывести в консоль компьютера.
//        Нельзя использовать метод Arrays.sort и подобные ему."
public class SortExample {
    public static void main(String[] args) {
        final int m [] = new int[] {40, 50, 60, 20, 1, 1999, 685, 5, 22, 898};
        out(m);
        sort(m);
        out(m);
    }

    private static void sort(int[] m) {
        System.out.println(" сортируем...");
        for (int i = 0; i < m.length-1; i++) {
            for (int j = 0; j < m.length-1; j++) {
                if(m[j] > m[j+1]){
                    int buffer = m[j];
                    m[j] = m[j+1];
                    m[j+1] = buffer;
                }
            }


        }
    }

    private static void out(int[] m) {
        for(int i:m){
            System.out.print(i + ", ");

        }
    }
}
