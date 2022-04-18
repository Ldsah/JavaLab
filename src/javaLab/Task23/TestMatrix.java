package javaLab.Task23;

public class TestMatrix {
    public static void main(String[] args) {
        Matrix m = new Matrix(4,4);
        System.out.println(m);
        m.setValue(3, 3, 2);
        System.out.println(m);

    }
}
