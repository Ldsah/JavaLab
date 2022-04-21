package javaLab.Task23;

public class Matrix {

    private int[][] data;

    public Matrix(int m, int n) {
        if (m <= 0 || n <= 0) {
            System.out.println("Неправильные значения");
            m = 2;
            n = 2;
        }
        data = new int[m][n];
    }

    public String toString(){
        String result = "";
        for(int x =0; x < data.length; x++){
            for (int y = 0; y <data[x].length; y++) {
                result += " " + data[x][y] ;
            }
            result +="\n";
        }
       return result;
    }



    public int getValue(int x, int y) {
        return data[x][y];
    }

    public void setValue(int x, int y, int value) {
       //заполинть матрицу полностью
        data[x][y] = value;
    }
}
